package SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {

    public static void main(String args[]){

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beansannotation.xml");

        Coach theCoach=context.getBean("tennisCoach",Coach.class);

        Coach alphaCoach= context.getBean("tennisCoach",Coach.class);

        boolean result=(theCoach==alphaCoach);

        System.out.println("pointing to tje same object  "+ result);

        System.out.println("memory of thecoahc"+theCoach);

        System.out.println("memory of aplh coach"+alphaCoach);

        context.close();
    }
}
