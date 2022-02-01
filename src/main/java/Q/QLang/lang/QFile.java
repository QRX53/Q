package Q.QLang.lang;

import java.io.File;

public class QFile {

    private File file;
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
