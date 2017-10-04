package SpringAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyCloudAsync {

    @Before("SpringAop.AopExpressions.forDaoNoGetterSetter()")
    public void logToCloudAsync(){
        System.out.println("performing log to syns ");
    }

}
