package com.teesra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        // Creating Object Reference
        Student s1 = new Student();
        Laptop l1 = new Laptop();

        // Setting Values to the properties
        l1.setBrand("Harsh");
        l1.setModel("Pro");
        l1.setRam(1024);

        s1.setRollNo(1);
        s1.setsName("Harsh");
        s1.setsAge(22);
        s1.setLaptop(l1);


        // Initializing the Configurations for the Hibernate ORM aur ye by default doodhta hai 'hibernate.cfg.xml' naam ki file ko samjhe
        Configuration cfg = new Configuration();

        // Apni Class ko Add kar rahe hain taaki Hibernate ko pata rahe ki ye ek class hai jisko table form mein store karna hai samjhe
        cfg.addAnnotatedClass(com.teesra.Student.class);

        // Yahan hamne kah diya Hibernate se ki bhai aapko saari configurations de di gayin hain abhi aap configure ho jao yaar thik hai samjhe
        cfg.configure();

        // Creating Session Factory for producing sessions by using which we can execute our queries or more clear to say operations on the DB samjhe
        SessionFactory sf = cfg.buildSessionFactory();

        // Creating the session
        Session session = sf.openSession();

        // Transaction banana jaroori hai nahin to kya hoga ki apna work jo bhi specify kar rahen hain ham log session mein vo save hi nahin hoga
        Transaction transaction = session.beginTransaction();

        // Saving the Object into the DB
        session.persist(s1);

        // Transanction ko commit kar doge to phir is particular transanction ka saara kaam save ho jayega
        transaction.commit();

        // Printing the Object Reference jo ki phir jake toString() method ko call karne wala hai
        System.out.println(s1);


        // Close the Session
        session.close();

        // Close the Session Factory
        sf.close();



    }
}