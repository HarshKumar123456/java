package com.harsh;

public class BSNL implements Sim {

    BSNL() {
        System.out.println("BSNL sim ka default Constructor call kiya gaya bhai....");
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
