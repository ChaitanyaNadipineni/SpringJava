package SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundWithLogger {

    private static Logger myLogger= Logger.getLogger(AroundWithLogger.class.getName());

    public static void main(String args[]){

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService theTraffic= context.getBean("trafficFortuneService",TrafficFortuneService.class);

       myLogger.info("around  advice execution");

        String data= theTraffic.getFortune();

        myLogger.info("around advice data"+data);


        context.close();
    }
}
