#import q.io;
#import q.std;

class Secondary

    cn Secondary()
    end

    fn run()
        try
            new Window as w("no", 70, 70);
        except
            // <"default">
            <"suppress">
            // <"printafter">
            // <"printbefore">
            io::err("Could not call the window package");
        end
    end

end

// this works!
@autoimport
class Main

    fn main()
        std::coutln("Help me");

        new Secondary as s();
        s::run();

    end

end