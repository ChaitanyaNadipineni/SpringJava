package SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String args[]){

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDao theAccount= context.getBean("accountDao",AccountDao.class);

        MembershipDao theMembership=context.getBean("membershipDao",MembershipDao.class);

        Account myAccount= new Account();
        myAccount.setName("chaitu");
        myAccount.setLevel("gold member");
        theAccount.addAccount(myAccount,true);

        theAccount.doWork();


        theAccount.setName("chaitu");
        theAccount.setServiceCode("programmer");

        theAccount.getName();
        theAccount.getServiceCode();

        theMembership.addMember();

        theMembership.gotoSleep();


        context.close();
    }
}
