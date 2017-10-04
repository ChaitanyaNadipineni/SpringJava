package Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String args[]){

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        CricketCoach theCoach= context.getBean("myCricketCoach",CricketCoach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkOut());

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        context.close();
    }
}
