package com.harsh;

import org.springframework.stereotype.Component;

@Component 
public class Airtel implements Sim {

    Airtel() {
        System.out.println("Airtel sim ka default Constructor call kiya gaya bhai....");
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
