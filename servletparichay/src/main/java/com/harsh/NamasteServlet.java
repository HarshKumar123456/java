package com.harsh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet ("/namaste") 
public class NamasteServlet extends HttpServlet {
    // private static final long serialVersionUID = 1L;

    // public void service(HttpServletRequest req, HttpServletResponse res) {

    //     System.out.println("Req: ");
    //     System.out.println(req);
    //     System.out.println("In Service");
    // }

    @Override 
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        
        System.out.println("Namaste Servelet in Service....");

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<h2><b>Namaste Duniya!</h2></b>");

        // res.getWriter().println("Namaste Duniya!");
    }
}
