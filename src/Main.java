import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.log4j.Logger;

public class Main {
    // https://logging.apache.org/log4j/2.x/manual/api.html
    final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.debug("test");
        System.out.println("Hello World!");

        HelloExample.bar(null);
        HelloExample2.foo(null);
    }
}
