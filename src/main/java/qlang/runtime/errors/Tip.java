package qlang.runtime.errors;

import com.github.tomaslanger.chalk.Chalk;

public class Tip {

    private final String tip;

    public Tip(String msg) {
        this.tip = ("[TIP] " + Chalk.on(msg).yellow());
    }

    public String getTip() {
        return (Chalk.on(this.tip).yellow() + "\n");
    }
}