/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.sql.DriverManager;
package com.mycompany.database;

/**
 *
 * @author HP
 */
public class JDBC {

    
    public static void main(String[] args) {
        try
     {
     DriverManager.getConnection("jdbc:mysql://localhost:3306/hinadb","root","Hinayadav18@");
     System.out.println("Connection established");
     }
     catch(SQLException e)
     {
       System.out.println(e);
     }   
         
    }

    }


