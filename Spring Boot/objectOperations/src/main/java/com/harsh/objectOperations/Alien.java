package com.harsh.objectOperations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component // Ye Jo Annotation haina bhai iski madad se ham log Spring Boot ke IoC Container ko bata pa rahen hain ki is wale class ko aapko manage karna hai yaani ki iski beans aapne banakar deni hain samjhe
public class Alien {
    int age;

    @Autowired // Ye jo Annotation hai iski madad se ham Spring Boot ko bata rahe hain ki ye ek class hai aur iska object yaani ki bean bhi Aapko hi manage karna hai 
    Laptop laptop;




    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public  void code() {
        laptop.compile();
        System.out.println("Coding....");
    }
}
