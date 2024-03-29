package qlang.core.lang;

import org.antlr.v4.runtime.Token;
import qlang.core.internal.Scope;
import qlang.core.lang.Q.QClass;
import qlang.core.lang.Q.QModule;
import qlang.runtime.STDLibs.AWT.QWinKit;
import qlang.runtime.STDLibs.io.QWebServer;
import qlang.runtime.core.Parser;
import qlang.runtime.core.Utilities;
import qlang.runtime.errors.Problem;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The environment that Q is currently running in, containing essential elements.
 */
public class Environment {

    // Static and available to use by anyone
    public static final Environment global = new Environment();
    public static String[] args;

    // General language elements
    public Map<String, Function> functions = new HashMap<>();
    public Map<String, Function> globalFns = new HashMap<>();
    public Scope scope = new Scope();
    public Visitor visitor = new Visitor(scope, functions);
    public String response = Utilities.string();
    public boolean verbose = false;
    public String shver = "v1.2.08";
    public String qversion = shver;
    public String releaseNotes = "Q Release: " + this.qversion + "\n\nShell Build: "
            + this.shver + "\n\nRelease Notes: Q version (" + this.qversion + ") fixes several issues with Q project creation, as well as adding more options to the Q help menu.";
    public String releaseNotesDetailed = this.releaseNotes + "\n\nDetailed Release Notes: Q version (" + this.qversion + ") added `-rn` and `-rnd` to the Q CLI. Changed Shell Build, and QCLI versions in the Env file; as well as updating the basic `q` command to be more helpful to new users.";
    public Parser parser = new Parser();
    public String installLocation = "/usr/local/bin";

    // Lists<>
    public List<File> parsed = new ArrayList<>();
    public List<Token> lst = new ArrayList<>();
    public List<QWinKit> wins = new ArrayList<>();
    public Map<String, QWebServer> webs = new HashMap<>();
    public List<String> allowedLibs = new ArrayList<>();
    public List<String> allLibs = new ArrayList<>();

    // Maps<>
    public Map<String, QClass> classes = new HashMap<>();
    public Map<String, QModule> modules = new HashMap<>();
    public Map<String, QClass.QObject> objs = new HashMap<>();
    public Map<String, File> files = new HashMap<>();
    public Map<String, Object> modValues = new HashMap<>();
    public Map<String, Function.INativeFunction> natives = new HashMap<>();
    public Map<String, Function> consts = new HashMap<>();
    public Map<String, NameSpace> namespaces = new HashMap<>();
    public Map<String, String> nativeJava = new HashMap<>();
    public Map<String, String> nativeNames = new HashMap<>();
    public Map<String, JTextArea> jTextAreaMap = new HashMap<>();

    public boolean hasMainExecuted = false;

    /**
     * Default constructor for the Environment class.
     */
    public Environment() {
    }

    /**
     * Check if the given name corresponds to an object in the environment.
     *
     * @param name The name to check.
     * @return True if the object with the given name exists, false otherwise.
     */
    public boolean getObj(String name) {
        return Utilities.getWebByName(name) != null || Utilities.getWinByName(name) != null || this.files.containsKey(name) || this.objs.containsKey(name);
    }

    /**
     * Destroy an object with the given name.
     *
     * @param name The name of the object to destroy.
     */
    public void destroy(String name) {
        if (Utilities.getWebByName(name) != null) {
            this.webs.remove(name);
        } else if (Utilities.getWinByName(name) != null) {
            this.wins.remove(Utilities.getWinByName(name));
        } else if (this.files.containsKey(name)) {
            this.files.remove(name);
        } else if (this.objs.containsKey(name)) {
            this.objs.remove(name);
        } else {
            throw new Problem("No such object to destroy: " + name);
        }
    }

    /**
     * Define a native function in the environment.
     *
     * @param e The native function to define.
     */
    public void defineNativeFunction(Function.INativeFunction e) {
        this.natives.put(e.name(), e);
    }
}
