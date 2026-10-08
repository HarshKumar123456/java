package com.harsh.springbootJDBC.model;

import org.springframework.stereotype.Component;

@Component 
public class Jio extends Sim {
    Jio() {
        System.out.println("Jio sim ka default Constructor call kiya gaya bhai....");
        this.setNameOfSim("Jio");
    }

    @Override
    public void call() {
        System.out.println("Jio Calling....");

    }

    @Override
    public void message() {
        System.out.println("Jio Messaging....");
    }

}
