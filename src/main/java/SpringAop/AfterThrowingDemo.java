package SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterThrowingDemo {

    public static void main(String args[]){

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDao theAccount= context.getBean("accountDao",AccountDao.class);

     List<Account> foundaccount=null;
     try {
         boolean tripwire=true;
         foundaccount = theAccount.findAccounts(tripwire);
     }
     catch (Exception exc){
         System.out.println("try catch block exception caught"+exc);
     }
     System.out.println("main program after throwing exceptipon");


     System.out.println(foundaccount);
        context.close();
    }
}
