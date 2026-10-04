package com.harsh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Inside Main.main() Method.....");
        // Dekhiye jo sab ham log vahan XML Configuration se kar rahe the ab vahi sab ham log Java Configuration se Karenge

        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(YoConfigurationFileHaiBhai.class);
            Mobile phone = context.getBean(Mobile.class);
            phone.makeACall();
            
            Sim nayiSim = context.getBean(Sim.class);

            // Sim change kar lete hain
            phone.setSim(nayiSim);
            
            // Nayi sim se call to karlo
            phone.makeACall();


            // Sarkari sim bhi use karlo bhai
            Sim sarkariSim = context.getBean(Sim.class);
            Sim sarkariSim2 = context.getBean(Sim.class);
            Sim defaultSim = context.getBean(Sim.class);
            Sim defaultSim2 = context.getBean(Sim.class);



            System.out.println(sarkariSim);
            System.out.println(sarkariSim2);
            System.out.println(defaultSim);
            System.out.println(defaultSim2);

            Sim tempSim = context.getBean(Sim.class); // Is wale tarike mein kya scene hai ki apne ko yaa to ek hi bean definition milni chahiye yaa phir primary vagairah kuchh Annotation lagana padega taaki confusion na create ho yaa phir name wala tarika jaise neeche hai samjhe
            Sim tempSim2 = (Sim) context.getBean("viKaComponentName");
            Sim tempSim3 = context.getBean("viKaComponentName", Sim.class);

            System.out.println(tempSim);
            System.out.println(tempSim2);
            System.out.println(tempSim3);



        } catch (Exception e) {
            System.out.println("Bhai System Hang ho gaya kuchh to exception ho gaya....");
            System.out.println(e);
        }

        System.out.println("End of Main.main() Method.....");


    }
}