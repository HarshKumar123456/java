package com.harsh;

public class Vi implements Sim {

    Vi() {
        System.out.println("Vi sim ka default Constructor call kiya gaya bhai....");
    }

    @Override
    public void call() {
        System.out.println("Vi Calling....");

    }

    @Override
    public void message() {
        System.out.println("Vi Messaging....");
    }

}
