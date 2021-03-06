import org.apache.log4j.Logger;

public class HelloExample{

    final static Logger logger = Logger.getLogger(HelloExample.class);

    public static void bar(String[] args) {

        HelloExample obj = new HelloExample();
        obj.runMe("mco 152 " + args[0]);

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }

}