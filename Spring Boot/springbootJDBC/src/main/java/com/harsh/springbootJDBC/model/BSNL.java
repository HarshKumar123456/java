package com.harsh.springbootJDBC.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
@Primary 
public class BSNL extends Sim {

    BSNL() {
        System.out.println("BSNL sim ka default Constructor call kiya gaya bhai....");
        this.setNameOfSim("BSNL");
    }

    @Override
    public void call() {
        System.out.println("BSNL Calling....");

    }

    @Override
    public void message() {
        System.out.println("BSNL Messaging....");
    }

}
