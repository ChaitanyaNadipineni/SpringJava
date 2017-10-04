package SpringAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalytics {

    @Before("SpringAop.AopExpressions.forDaoNoGetterSetter()")
    public void performApiAnalytics(){
        System.out.println("its api analytics method");
    }
}
