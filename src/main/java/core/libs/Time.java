package core.libs;

import core.etc.Environment;
import core.etc.Parser;
import core.interp.QParser;
import core.lang.INativeFunction;
import core.lang.q.QValue;
import core.libs.utils.QLibrary;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

public class Time extends QLibrary {

    private final String qcode = String.format(
            """
                                
                    fn EAL()
                        return "%s";
                    end
                                        
                    fn IAL()
                        return "%s";
                    end
                                
                    """, Instant.now().toEpochMilli(), Instant.now().toString());

    public QValue cur() {
        String time = "";

        LocalDateTime i = LocalDateTime.now();

        time += i.getHour();
        time += ":";
        time += i.getMinute();
        time += ":";
        time += i.getSecond();

        return new QValue(time);
    }

    public QValue date() {
        String date = "";

        date += LocalDateTime
                .now().getDayOfMonth();
        date += "/";
        date += LocalDateTime
                .now().getMonth().getValue();
        date += "/";
        date += LocalDateTime
                .now().getYear();

        return new QValue(date);
    }

    public QValue instant() {
        String s = Instant.now().toString();
        return new QValue(s);
    }

    @Override
    public String getName() {
        return "q.time";
    }

    @Override
    public void init() {
        Parser parser = new Parser().fromText(this.qcode);
        try {
            parser.parse();
        } catch (IOException e) {
            System.out.println("[FATAL] " + e.getMessage());
            System.exit(0);
        }
    }

}
