package com.harsh;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Component;


// Jab bhi ye Component Annotation Uncomment Karo to upar ke imports se lekar Autowired, Quantifier Annotations tak sab uncomment karna to use Java Based Configuration samjhe
// @Component 
public class Mobile {
     

    // Java Based Configuration mein Autowire karne ke liye ye Autowired Annotation use karte hain 
    // @Autowired 
    Sim sim;


    Mobile() {
        System.out.println("Mobile ka default constructor call kiya gaya hai bhai....");
    }
    
    

    // Ye Setter Injection hai Java Based Configuration mein Samjhe
    // Aur jab ye setter injection rahega to iski priority wali sim daali jayegi 
    // @Autowired 
    // @Qualifier ("viKaComponentName") // Iski help se ham log choose kar sakte hain ki kaunsi wali Sim use karni hai like @Primary laga hua hai BSNL mein agar ye nahin lagate to BSNL choose ki jati par ye lagaya hai to is naam ko match karne wala component wali sim use ki jayegi samjhe
    public void setSim(Sim sim) {
        System.out.println("Setter call kiya gaya hai bhai....");
        // Aur Setter se sim change ki jayegi
        this.sim = sim;
        System.out.println("Current sim jo hai usse call karte hain...."+ this.sim);
        this.sim.call();
    }


    void makeACall() {
        System.out.println("Mobile making a call....");
        sim.call();
    }
}
