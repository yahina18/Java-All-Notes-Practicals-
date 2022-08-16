/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.filehandling;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable
{
    private int id;
    private String name;
    private int sal;
    Emp(int id, String name, int sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public void show()
    {
        System.out.println(id +" "+name+ " " +sal);
    }
    
}
public class Serialization_FileWriterReadPract {

   
    public static void main(String[] args) {
        Emp e = new Emp(101,"Ram",25000);
        try
        {
            // Object Write in file
            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:\\Core_Java\\Practical_File\\FileHandling\\ser.txt"));
            oos.writeObject(e);
            oos.flush();
            oos.close();
            System.out.println("Done!!!!");
            // object Read from file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Core_Java\\Practical_File\\FileHandling\\ser.txt"));
           Emp e2= (Emp) ois.readObject();
           e2.show();
            
        }
        
        catch(Exception e1)
        {
            System.out.println(e1);
        }
       
    }
    
}
