package SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundHandleException {

    private static Logger myLogger= Logger.getLogger(AroundHandleException.class.getName());

    public static void main(String args[]){

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService theTraffic= context.getBean("trafficFortuneService",TrafficFortuneService.class);

       myLogger.info("around  advice execution");

       boolean tripwire=true;

        String data= theTraffic.getFortune(tripwire);

        myLogger.info("around advice data"+data);


        context.close();
    }
}
