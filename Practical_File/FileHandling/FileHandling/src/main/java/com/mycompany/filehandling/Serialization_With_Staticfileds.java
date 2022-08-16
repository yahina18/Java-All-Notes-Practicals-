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

class Emp2 implements Serializable
{
    private int id;
    private String name;
    private  transient int sal; // the transient filed participate in serialization with its default value
    private static String cname;// static filed never takes the participation in serialization processs.
    
    Emp2(int id, String name,int sal,String cname)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.cname = cname;
    }
    public void show()
    {
        System.out.println(id+" "+name+" "+sal+" "+cname);
    }
    public void set_cname(String cname)
    {
           this.cname = cname;       
    }
}
public class Serialization_With_Staticfileds {

   
    public static void main(String[] args) {
      Emp2 e2 = new Emp2(120,"Hina", 12000000,"Microsoft");
      e2.show();
      try
          
      {
          // write obhject in file
          ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream ("D:\\Core_Java\\Practical_File\\FileHandling\\ser3.txt"));
          oos.writeObject(e2);
          oos.flush();
          oos.close();
        System.out.println("Done!!!!");
        e2.set_cname("Amazon");
        // read object from file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Core_Java\\Practical_File\\FileHandling\\ser3.txt"));
     Emp2 e3 = (Emp2)  ois.readObject();
     e3.show();
      }
      
      catch(Exception ex)
      {
          System.out.println(ex);
      }
    }
    
}
