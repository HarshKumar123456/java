package com.harsh;

// import org.springframework.beans.factory.annotation.Autowired;

public class Mobile {
    
    /*
    Ab dekho plain ye likhne se kaam nahin chalega aur @Autowired bhi nahin chalega kyonki ye XML Configuration wala method hai
    Aur sabse important ki bhai hamne pass hi nahin kiya kuchh bhi to ye to null rahega yaani ki isko pata hi ki kya use karna hai as sim to yaa to construtor mein yaa to setter mein pass karna padega object reference aur isi ko shastron mein Constructor Injection aur Setter Injection kaha gaya hai samjhe 
    */
    // @Autowired  
    Sim sim;


    Mobile() {
        System.out.println("Mobile ka default constructor call kiya gaya hai bhai....");
    }
    
    
    // Ye Hamne Constructor mein de diya bhai ko ki bhaisahab ye lo ye wali sim use karna hai aapko samjhe
    // Par ye hamko XML configuration mein bhi batana padega nahin to vo default constructor ko dhoondhega aur nahin milega to error marega samjhe
    Mobile(Sim sim) {
        System.out.println("Mobile ka (Sim) constructor call kiya gaya hai bhai....");
        // Constructor ki help se default sim selected rahegi 
        this.sim = sim;
        System.out.println("Current sim jo hai usse call karte hain...." + this.sim);
        this.sim.call();
    }


    // Phir ye raha apna Setter Injection jismein ham log set karte vakt bata rahe hain ki kaunsi sim use karni hai samjhe
    // Par ye hamko XML configuration mein bhi batana padega nahin to error marega samjhe
    // Dekho yahan par public lagana bahut zaroori hai kyonki apni bean configurations alag package mein hain isliye use access karne ke liye apne ko public lagana padega samjhe
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
