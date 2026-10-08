package com.harsh.springbootJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.harsh.springbootJDBC.model.Mobile;
import com.harsh.springbootJDBC.model.Sim;
import com.harsh.springbootJDBC.service.MobileService;


@SpringBootApplication
public class SpringbootJdbcApplication {

	
    public static void main(String[] args) {
        
        System.out.println("Inside SpringbootJdbcApplication.main() Method.....");
        
        try {
            ApplicationContext context = SpringApplication.run(SpringbootJdbcApplication.class, args);
			

            Mobile phone = context.getBean(Mobile.class);
            phone.setMobileName("phone");
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


			MobileService yahMobileServiceHai = context.getBean(MobileService.class);
			yahMobileServiceHai.saveMobile(phone);

            Mobile phone2 = context.getBean(Mobile.class);
            phone2.setMobileName("phone2");
            phone2.setSim(tempSim3);
            yahMobileServiceHai.saveMobile(phone2);


			List<Mobile> allMobiles = yahMobileServiceHai.getAllMobiles();

			System.out.println("Printing All Mobiles : ");
			for (Mobile mobile : allMobiles) {
				System.out.println(mobile);
			}
			System.out.println("Printed All Mobiles....");



        } catch (Exception e) {
            System.out.println("Bhai System Hang ho gaya kuchh to exception ho gaya....");
            System.out.println(e);
        }

        System.out.println("End of SpringbootJdbcApplication.main() Method.....");


    }
}