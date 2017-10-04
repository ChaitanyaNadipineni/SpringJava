package SpringAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(1)
public class MyDemoLogging  {
/*
    @Pointcut("execution( * SpringAop.*.*(..))")
    private void forDaoPackage(){}


    @Pointcut("execution( * SpringAop.*.get*(..))")
     private void getter(){}

    @Pointcut("execution( * SpringAop.*.set*(..))")
     private void setter(){}


    @Pointcut("forDaoPackage()&&!(getter()||setter())")
    private void forDaoNoGetterSetter(){}
*/
    @Before("SpringAop.AopExpressions.forDaoNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoin){

        System.out.println("Advice method i executed");

        MethodSignature methodSign=(MethodSignature)theJoin.getSignature();

        System.out.println("method"+methodSign);


        Object[] args=theJoin.getArgs();

        for(Object tempArg:args){
            System.out.println(tempArg);

            if(tempArg instanceof Account){
                Account theAccount=(Account)tempArg;

                System.out.println("account name="+theAccount.getName());
                System.out.println("account name="+theAccount.getLevel());
            }
        }
    }







}
