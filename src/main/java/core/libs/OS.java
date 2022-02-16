package core.libs;

import core.lang.lang;
import core.libs.utils.QLibrary;

import java.io.IOException;

public class OS extends QLibrary {

    public static void execS(String cmd) throws IOException {
        Process p = Runtime.getRuntime().exec(cmd);
        p.destroy();
    }

    public String id;

    public OS(String id) {
        this.id = id;
    }

    public void exec(String cmd) {
        Process p = null;
        try {
            p = Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p.waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p.exitValue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p.destroy();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getName() {
        return "";
    }
}
