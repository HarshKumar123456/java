package com.harsh.objectOperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ObjectOperationsApplication {

	public static void main(String[] args) {

		// SpringApplication.run(ObjectOperationsApplication.class, args); // This line
		// is given by default by the start.spring.io as start of the application

		// Ab ye jo AppicationContext Object hai vo kya kaam karta hai?
		// Ye basically apne ko ek central interface provide karta hai jiski madad se ham log kya kar sakte hain ki bean factory ke methods ko call kar sakte hain, file resources ko load kar sakte hain aur aisi hi kayi cheejen kar sakten hain samjhe
		ApplicationContext context = SpringApplication.run(ObjectOperationsApplication.class, args);


		// Ab ye dekho context ki madad se ham log kya kar pa rahe hain bina new keyword ko likhe huye hi ham log object ko la pa rahe hain like bean ko la pa rahen hain aur ye manage kaun kar raha hai apne Spring Boot Bhaisahab samjhe
		// Par par par ye ek hi object dega by default aur iska saboot hai ki jab ham object ko print karwa rahe hain to vah same hashCode de raha my dear friend samjhe
		Alien megaRobot = context.getBean(Alien.class);
		Alien megaRobot2 = context.getBean(Alien.class);

		megaRobot.code();
		megaRobot2.code();


		megaRobot.setAge(20);


		System.out.println(megaRobot.getAge());
		System.out.println(megaRobot2.getAge());

		System.out.println(megaRobot);
		System.out.println(megaRobot2);



		// Abhi ye check karna interesting rahega ki apna jo nested object hai laptop uske kitne instances milte hain by default 
		Laptop laptop = context.getBean(Laptop.class);


		// To bhaiya answer ye hai ki ek hi bean create hogi chahe jahan jitne baar jaise bhi use karlo by default tarike se to ek hi bean create hogi bhaisahab aur iska saboot hai ki ye sab same hashCode Print kar rahen hain samjhe 
		System.out.println(megaRobot.laptop);
		System.out.println(megaRobot2.laptop);
		System.out.println(laptop);

	}

}
