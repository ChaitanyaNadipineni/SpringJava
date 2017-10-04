package com;

import com.CarType;


public class Engine implements CarType{

    private int cc;
    public void engineVersion(){
        System.out.println("v6 with 200hp engine");

    }



    public void transmissionType(){

        System.out.println("manual Transmission");
    }
}
