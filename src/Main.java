import org.apache.log4j.Logger;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.debug("test");
        System.out.println("Hello World!");

        HelloExample.bar(null);
        HelloExample2.foo(null);
    }
}
