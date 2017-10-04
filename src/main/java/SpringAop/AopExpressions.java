package SpringAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopExpressions {

    @Pointcut("execution( * SpringAop.*.*(..))")
    public void forDaoPackage(){}


    @Pointcut("execution( * SpringAop.*.get*(..))")
    public void getter(){}

    @Pointcut("execution( * SpringAop.*.set*(..))")
    public void setter(){}


    @Pointcut("forDaoPackage()&&!(getter()||setter())")
    public void forDaoNoGetterSetter(){}

}
