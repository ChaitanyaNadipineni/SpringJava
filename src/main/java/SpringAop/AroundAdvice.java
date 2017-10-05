package SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AroundAdvice {

    public static void main(String args[]){

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService theTraffic= context.getBean("trafficFortuneService",TrafficFortuneService.class);

        System.out.println("around  advice execution");

        String data= theTraffic.getFortune();

        System.out.println("around advice data"+data);


        context.close();
    }
}
