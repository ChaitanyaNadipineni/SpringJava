package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ride {

    public static void main(String args[]) {


        //http://www.baeldung.com/hibernate-4-spring

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Car car = context.getBean(Car.class);

        System.out.println(car.getDriver().getId());

        car.getEngine().engineVersion();
        car.getEngine().transmissionType();


    }
}
