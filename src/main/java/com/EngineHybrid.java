package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EngineHybrid implements CarType {

    public void engineVersion(){
        System.out.println("hybrid with 100hp engine");
    }

    public void transmissionType(){
        System.out.println("auto transmission");
    }

}
