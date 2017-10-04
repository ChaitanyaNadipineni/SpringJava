package SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

    public static void main(String args[]){


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansannotation.xml");

        Coach theCoach= context.getBean("tennisCoach",Coach.class);

        FortuneService thefortune= context.getBean("restFortune",FortuneService.class);

       // System.out.println(theCoach.getDailyFortune());

       // System.out.println(theCoach.getDailyWorkout());

        System.out.println(thefortune.getFortune());



        context.close();
    }
}
