package Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String args[]){

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        Coach theCoach= context.getBean("mycoach",Coach.class);

        System.out.println(theCoach.getDailyWorkOut());


        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
