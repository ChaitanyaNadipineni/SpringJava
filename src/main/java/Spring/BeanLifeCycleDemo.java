package Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
    public static void main(String args[]){

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanlifecycle.xml");

        Coach theCoach = context.getBean("mycoach",Coach.class);



        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
