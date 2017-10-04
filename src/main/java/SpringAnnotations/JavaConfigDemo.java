package SpringAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {

    public static void main(String args[]){


        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);

       Coach theCoach= context.getBean("tennisCoach",Coach.class);

     //   FortuneService thefortune= context.getBean("restFortune",FortuneService.class);

       // System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getDailyWorkout());

        //System.out.println(thefortune.getFortune());



        context.close();
    }
}
