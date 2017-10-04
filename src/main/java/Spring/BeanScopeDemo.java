package Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class BeanScopeDemo {
    public static void main(String args[]){

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanscope.xml");

        Coach theCoach = context.getBean("mycoach",Coach.class);

        Coach aplhaCoach= context.getBean("mycoach",Coach.class);

        boolean result= (theCoach==aplhaCoach);

        System.out.println("same object  "+ result);

        System.out.println("memory location"+theCoach);

        System.out.println("memory location for alphs coach"+aplhaCoach);
    }
}
