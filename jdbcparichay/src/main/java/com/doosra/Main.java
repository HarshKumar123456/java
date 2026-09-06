package com.doosra;

// Import Package
// import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 7 Essential Steps to Setup Connect with JDBC
        // Import Package
        // Load Driver
        // Register Driver
        // Create Connection
        // Create Statement
        // Execute Statement
        // Close Connection

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uname = "postgres";
        String pass = "harsh";

        // Load and Register Driver
        // Class.forName("org.postgresql.Driver");

        // Create Connection
        Connection yahConnectionHai = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established....");
        
        // Create Statement
        // Statement yahStatementHai = yahConnectionHai.createStatement();

        // But ye jo statement haina vo pata hai kyon nahin jyada use hota kyonki ye Dynamic Values ko nahin leta hai like ham pahle se hardcode na karen queries ke andar values halanki thoda sa concat vagairah karke kar sakte hain Dynamic values wala scene but if there is good way to kahe utna tough way se dimag lagakar concat karo 
        // Phir ye SQL injection ka bhi dar badha deta hai aur data type handling mein Date aur Time ko handle karna thoda sa tricky bana deta hai isliye PreparedStatement Use mein laya jata hai
        // Aur performance issues bhi rahte hain ismein samjhe

        // PreparedStatement
        PreparedStatement yahPreparedStatementHai = yahConnectionHai.prepareStatement("SELECT * FROM Human;");


        // Execute Statement
        // ResultSet queryKaResultStoredInResultSet = yahStatementHai.executeQuery("SELECT * FROM Human;"); // Isko Statement ke saath use karna hai
        ResultSet queryKaResultStoredInResultSet = yahPreparedStatementHai.executeQuery(); // Isko PreparedStatement ke saath use karna hai

        // Processing Result
        System.out.println(queryKaResultStoredInResultSet);

        System.out.println("Printing the Data of the Table: ");
        System.out.println();

        while (queryKaResultStoredInResultSet.next() == true) {

            String idOfHuman = queryKaResultStoredInResultSet.getString("id");
            String nameOfHuman = queryKaResultStoredInResultSet.getString("name");
            String genderOfHuman = queryKaResultStoredInResultSet.getString("gender");
            Integer ageOfHuman = queryKaResultStoredInResultSet.getInt("age"); // Ye bhi Chalega
            // int ageOfHuman = queryKaResultStoredInResultSet.getInt("age"); // Ye bhi
            // chalega

            System.out.println(idOfHuman + "    " + nameOfHuman + "    " + genderOfHuman + "    " + ageOfHuman);

        }

        // Close Connection
        yahConnectionHai.close();

    }
}