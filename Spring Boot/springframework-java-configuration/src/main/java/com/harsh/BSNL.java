package com.harsh;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 

// Ye jo Primary Annotation hai vo confusion ko khatam karta hai agar multiple beans available hon same type ki aur apne ko depedency inject karni ho like Autowire kind of thing jo hamne ki thi XML mein bhi samjhe
@Primary 
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
