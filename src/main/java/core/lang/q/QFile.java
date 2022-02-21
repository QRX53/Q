package core.lang.q;

import java.io.File;

@SuppressWarnings("all")
public class QFile {

    private final File file;
    private boolean called;

    public QFile(File f, boolean called) {
        this.file = f;
        this.called = called;
    }

    public boolean check() {
        return this.called;
    }

    public void setCalled(boolean value) {
        this.called = value;
    }

}
