package com.harsh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        System.out.println("Inside Main.main() Method.....");

        ApplicationContext context = new ClassPathXmlApplicationContext("yahXMLFileHaiJiskaNaamKuchhBhiHoSaktaHai.xml");

        Mobile phone = context.getBean("mobileKaIdWalaNaamXMLConfigKeAndar", Mobile.class);
        phone.makeACall();

        // Ab dekho constructor injection ki help se default sim to mil gayi thi but the fact ki abhi mujhmein kahin baaki thodi si hai zindagi sorry sorry ab sim change karne ke liye ham log setter injection ka use kar lete hain ye lijiye aapki screen par
        Sim nayiSim = context.getBean("nayiSimKaIdWalaNaamXMLConfigKeAndar", Sim.class);
        
        // Sim change kar lete hain
        phone.setSim(nayiSim);
        
        // Nayi sim se call to karlo
        phone.makeACall();
        

        // Sarkari sim bhi use karlo bhai
        Sim sarkariSim = context.getBean("sarkariSimKaIdWalaNaamXMLConfigKeAndar", Sim.class);
        Sim sarkariSim2 = context.getBean("sarkariSimKaIdWalaNaamXMLConfigKeAndar", Sim.class);
        Sim defaultSim = context.getBean("defaultSimKaIdWalaNaamXMLConfigKeAndar", Sim.class);
        Sim defaultSim2 = context.getBean("defaultSimKaIdWalaNaamXMLConfigKeAndar", Sim.class);


        // Eeb dekho ki yahan kya hua ki bhai scope by default apna singleton rahta hai isliye har ek Id ke corresponding ek naya object ban raha hai but the fact ki agar same id ka use alag alag variable ke saath karoge to ek hi object milne wala hai chahe phir vo kisi object ki property hi kyon na ho jaise phone.sim jo hai usmein by default constructor se jo sim mili hai vahi default sim yahan defaultSim aur defaultSim2 mein mili hai samjhe 
        System.out.println(sarkariSim);
        System.out.println(sarkariSim2);
        System.out.println(defaultSim);
        System.out.println(defaultSim2);



        // Eeb yo dekho bhai ki ham log kaise Sirf Class Type ka use karke GetBean kar saken hain
        Sim tempSim = context.getBean(Sim.class); // Is wale tarike mein kya scene hai ki apne ko yaa to ek hi bean definition milni chahiye yaa phir primary vagairah kuchh attribute lagana padega taaki confusion na create ho samjhe
        Sim tempSim2 = (Sim) context.getBean("defaultSimKaIdWalaNaamXMLConfigKeAndar");

        System.out.println(tempSim);
        System.out.println(tempSim2);

        

        System.out.println("End of Main.main() Method.....");


    }
}