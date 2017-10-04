package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Driver driver;

    @Autowired
    private CarType engine;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public CarType getEngine() {
        return engine;
    }

    public void setEngine(CarType engine) {
        this.engine = engine;
    }
}
