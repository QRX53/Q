package core.lang.q;

import core.etc.Scope;
import core.lang.Function;
import core.lang.Visitor;

import java.util.List;
import java.util.Map;

public class QClass implements Cloneable {

    public static QClass OBJECT = new QClass();

    public String name;
    public Map<String, Function> functions;
    public Scope scope;
    public List<QValue> constArgs;
    public QClass base;
    public Visitor v;

    public QClass(String name, Map<String, Function> functions, Scope scope) {
        this.name = name;
        this.functions = functions;
        this.scope = scope;
    }

    public QClass() {
    }

    public String getName() {
        return name;
    }

    public void setConstArgs(List<QValue> constArgs) {
        this.constArgs = constArgs;
    }

    public void setBase(QClass base) {
        this.base = base;
    }

    public void setV(Visitor v) {
        this.v = v;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
