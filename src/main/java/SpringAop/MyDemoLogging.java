package SpringAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;


@Aspect
@Component
@Order(1)
public class MyDemoLogging {
    
    private Logger myLogger=Logger.getLogger(getClass().getName());
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
    @Around ("execution(* SpringAop.TrafficFortuneService.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint theJoinPoint)throws Throwable{

        String methos=theJoinPoint.getSignature().toShortString();
        myLogger.info("arounf methos execution in the aroundget fortune metod");

        long begin=System.currentTimeMillis();

        Object result=theJoinPoint.proceed();

        long end=System.currentTimeMillis();

        long duraiton= end-begin;

        myLogger.info("the dutration to excecute is"+duraiton/1000.0+"seconds");

        return null;
    }

    @After ("execution(* SpringAop.AccountDao.findAccounts(..))")
    public void afterFinallyFindAccounts(JoinPoint theJoinPoint){

        String method=theJoinPoint.getSignature().toShortString();

        myLogger.info("executing after Finally method ");

    }
    @AfterThrowing(pointcut = ("execution(* SpringAop.AccountDao.findAccounts(..))"),throwing = "theExc")
    public void afterThrowningAdvice(JoinPoint theJoinPoint, Throwable theExc){

        String method= theJoinPoint.getSignature().toShortString();
        myLogger.info("executing after throwing the exception");

        myLogger.info(" the exception"+theExc);

    }
    @AfterReturning(pointcut = "execution(* SpringAop.AccountDao.findAccounts(..))", returning = "result")
    public void afterReturningFindAccounts(JoinPoint theJoinPoint, List<Account> result) {

        String method= theJoinPoint.getSignature().toShortString();
        myLogger.info("executing after the method to find accounts");

        converAccountNamesToUpperCase(result);

        myLogger.info("result is"+result);


    }

    private void converAccountNamesToUpperCase(List<Account> result) {

        for(Account tempAccount: result){

            String theUpperName= tempAccount.getName().toUpperCase();

            tempAccount.setName(theUpperName);

        }
    }


    @Before("SpringAop.AopExpressions.forDaoNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoin) {

        myLogger.info("Advice method i executed");

        MethodSignature methodSign = (MethodSignature) theJoin.getSignature();

        //myLogger.info("method" + methodSign);


        Object[] args = theJoin.getArgs();

        for (Object tempArg : args) {
            myLogger.info(tempArg.toString());

            if (tempArg instanceof Account) {
                Account theAccount = (Account) tempArg;

                myLogger.info("account name=" + theAccount.getName());
                myLogger.info("account name=" + theAccount.getLevel());
            }
        }
    }


}
