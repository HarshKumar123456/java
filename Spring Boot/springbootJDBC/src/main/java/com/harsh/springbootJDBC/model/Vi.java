package com.harsh.springbootJDBC.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("viKaComponentName") 
@Scope ("prototype")
public class Vi extends Sim {

    Vi() {
        System.out.println("Vi sim ka default Constructor call kiya gaya bhai....");
        this.setNameOfSim("Vi");
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
