package SpringAop;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {
     public String getFortune(){

         try {
             TimeUnit.SECONDS.sleep(10);
         }
         catch (InterruptedException e){
             e.printStackTrace();
         }
         return" heavy traffic ......";
     }
}
