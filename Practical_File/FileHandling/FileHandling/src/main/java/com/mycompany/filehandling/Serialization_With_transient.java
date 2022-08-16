/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp1 implements Serializable
{
    private int id;
    private String name;
    private  transient int sal; // the transient filed participate in serialization with its default value
    Emp1(int id, String name,int sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public void show()
    {
        System.out.println(id+" "+name+" "+sal);
    }
}

public class Serialization_With_transient {

   
    public static void main(String[] args) {
        
        Emp1 e = new Emp1(110,"Hina", 10000000);
        e.show();
        try
        {
            // Write object in the file 
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Core_Java\\Practical_File\\FileHandling\\ser1.txt"));
            oos.writeObject(e);
            oos.flush();
            oos.close();
            System.out.println("Done!!!!");
            // Read object from the file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Core_Java\\Practical_File\\FileHandling\\ser1.txt"));
            Emp1 e3=(Emp1)ois.readObject();
            e3.show();
            
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
      
    }
    
}
