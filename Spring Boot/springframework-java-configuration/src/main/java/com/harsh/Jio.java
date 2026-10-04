package com.harsh;

import org.springframework.stereotype.Component;

@Component 
public class Jio implements Sim {
    Jio() {
        System.out.println("Jio sim ka default Constructor call kiya gaya bhai....");
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
