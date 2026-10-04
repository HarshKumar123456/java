package com.harsh;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("viKaComponentName") // Ismein Component ke naam mein multiple names nahin de sakte hain like ki list mein provide kar diya samjhe
@Scope ("prototype")
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
