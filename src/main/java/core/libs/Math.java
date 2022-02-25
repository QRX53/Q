package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

public class Math extends QLibrary {

    @SuppressWarnings("all")
    private final String qcode = """
            #import q.Windows;
            #import q.Files;
            #import q.Math;
            #import q.Audio;
            #import q.http;
            #import q.Random;
            #import q.Console;
            #import q.Time;
                        
            fn pow(x, y)
                return x^y;
            end
                        
            fn fib(n)
              
                if (n < 2)
                    return n;
                else
                    return fib(n - 1) + fib(n - 2);
                end
                
            end

            fn fact(n)
                if (n < 2)
                    return n;
                else
                    return n * fact(n - 1);
                end
            end
                        
            fn sqrt(x)
                return x^0.5;
            end

            fn triang(n)

                p1 = n + 1;
                mul = n * p1;

                return mul / 2;
            end
                        
            fn density(mass, volume)
                d = mass / volume;
                return d;
            end
                        
            fn density(mass, volume, density)
                d = density * mass / volume;
                return d;
            end

            fn volume(mass, density)
                v = mass / density;
                return v;
            end

            fn mass(volume, density)
                m = density * volume;
                return m;
            end

            fn mass(volume, density, mass)
                m = mass * density / volume;
                return m;
            end

            fn mph(distance, time)
                mph = distance / time;
                return mph;
            end

            fn mph(distance, time, mph)
                mph = mph * distance / time;
                return mph;
            end

            fn o(n)
                        
                if (n < 2)
                    return 1;
                else
                    return n * o(n-1);
                end
                        
            end
                        
            class Calculator
                        
                cn Calculator();
                
                fn mul(x, y)
                    return x * y;
                end
                
                fn div(x, y)
                    return x / y;
                end
                
                fn mod(x, y)
                    return x % y;
                end
                        
            end
                        
            """;

    public String getName() {
        return "q.Math";
    }

    @Override
    public void init() {
        Parser.execBlock(this.qcode);
    }

}
