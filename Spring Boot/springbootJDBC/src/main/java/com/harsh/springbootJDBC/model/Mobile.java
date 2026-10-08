package com.harsh.springbootJDBC.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component 
public class Mobile {
     

    @Autowired 
    Sim sim;
    
    String mobileName;

    public String getMobileName() {
        return mobileName;
    }


    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getSimName() {
        return this.sim.getNameOfSim();
    }



    public Mobile() {
        System.out.println("Mobile ka default constructor call kiya gaya hai bhai....");
    }
    
    

    @Autowired 
    @Qualifier ("viKaComponentName") 
    public void setSim(Sim sim) {
        System.out.println("Setter call kiya gaya hai bhai....");
        // Aur Setter se sim change ki jayegi
        this.sim = sim;
        System.out.println("Current sim jo hai usse call karte hain...."+ this.sim);
        this.sim.call();
    }


    // Ye method public kiya gaya hai bhai kyonki agar ise outside package access karna hai to public hona chahiye na samjhe
    public void makeACall() {
        System.out.println("Mobile making a call....");
        sim.call();
    }


    @Override
    public String toString() {
        return "Mobile: " + " " + this.hashCode() + " " + this.getMobileName();
    }


    
}
