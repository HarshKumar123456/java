package com.harsh.springbootJDBC.model;

import org.springframework.stereotype.Component;

@Component 
public class Airtel extends Sim {

    Airtel() {
        System.out.println("Airtel sim ka default Constructor call kiya gaya bhai....");
        this.setNameOfSim("Airtel");
    }

    @Override
    public void call() {
        System.out.println("Airtel Calling....");

    }

    @Override
    public void message() {
        System.out.println("Airtel Messaging....");
    }

}
