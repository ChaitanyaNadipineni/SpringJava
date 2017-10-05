package SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterReturningDemo {

    public static void main(String args[]){

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDao theAccount= context.getBean("accountDao",AccountDao.class);

     List<Account> foundaccount=theAccount.findAccounts(false);

     System.out.println("main program after advice");

     System.out.println(foundaccount);
        context.close();
    }
}
