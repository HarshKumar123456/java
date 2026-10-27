package com.harsh;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException {


        // Dekho kya hota hai ki ek Servlet Container Banana Padta hai jo apne liye Servlets ko Serve karne ka kaam karta hai samjhe
        // A Servlet container, also called a Servlet engine, provides the runtime environment for servlets. It manages servlet lifecycle, request processing, response generation, sessions, security, and other web application services.
        
        // Phir iske baad kya hota hai
        /*
        Execution of Servlets basically involves Six basic steps: 

        1. The client sends an HTTP request.
        2. The web server or Servlet container receives the request.
        3. The container identifies the servlet mapped to the requested URL.
        4. The container invokes the appropriate servlet method, such as doGet() or doPost().
        5. The servlet processes the request and generates a response.
        6. The container sends the response back to the client.
        
        */

        /*
        
        Services Provided by a Servlet Container :

        1. Servlet lifecycle management: Loads, initializes, executes, and destroys servlets.
        2. Request and response handling: Creates request and response objects and passes them to the servlet.
        3. URL mapping: Maps incoming URLs to the appropriate servlet.
        4. Session management: Provides APIs for maintaining client sessions, commonly through HttpSession.
        5. Security: Supports authentication, authorization, and security constraints.
        6. Resource management: Manages web application resources and servlet components.
        7. Concurrency management: Handles multiple requests and invokes servlets as required.


        */

        System.out.println("Hello World!");

        // Sabse Pahle Tomacat server banana padega jo hamare liye SpringBoot Automatically Bana deta hai but kyonki ye Spring Boot Project nahin hai isliye hamein khudse hi banana padega aur manage karna padega samjhe
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // CRITICAL FIX: Forces Tomcat to initialize the default HTTP connector
        // Trigger the creation of the default connector
        // Ye wali line se kya hota hai ki bhai jo apna tomcat server hai usko pata chalta hai ki bhai aapko HTTP connector chahiye hai aur ye isse pahle i mean tomcat 9 se pahle nahin chahiye padta tha but abhi chahiye padta hai kyonki tomcat bhai ne apni implementation badal li hai kyonki ye other setups jaise ki configuring custom SSL host contexts, setting up multiple connectors, or using non-HTTP protocols like AJP aur phir ek aur reason hai ki Network Protocols ke bina bhi test karne wale features support karne ke liye bhi badla gaya hai  
        tomcat.getConnector(); 

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "NamasteServlet", new NamasteServlet());
        context.addServletMapping("/hello", "NamasteServlet");
        // context.addServletMapping("", "NamasteServelet", false);
        // context.addServletMapping("", "NamasteServelet", true);


        // Ye line se apna tomcat server start ho jayega ready to listen things but start hokar rokne ke liye apne ko await() ka use karna pada nahin to immediately terminate ho jata haina
        tomcat.start();
        tomcat.getServer().await();
    }
}