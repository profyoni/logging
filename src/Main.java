import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.log4j.Logger;

public class Main {
    // https://logging.apache.org/log4j/2.x/manual/api.html

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("test");
        try{
            System.out.println("".charAt(-1));
        }
        catch(Exception e){
            logger.error(e);
            String s = "";
            for ( StackTraceElement ste: e.getStackTrace())
            {
                s += ste.toString() + "\n";
            }
            logger.error(s);
        }
        System.out.println("Hello World!");

        for (int i=0;i<999999;i++)
        {
            HelloExample.bar(new String[] {"" + i});
            HelloExample2.foo(new String[] {"" + i});
        }
    }
}
