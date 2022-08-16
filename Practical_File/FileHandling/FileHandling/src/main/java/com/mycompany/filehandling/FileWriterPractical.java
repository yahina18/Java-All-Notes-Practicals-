/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterPractical {

   
    public static void main(String[] args) {
        try
        { // FileWriter
        FileWriter fw = new FileWriter("D:\\Core_Java\\Practical_File\\FileHandling\\text.txt",true);
        fw.write(65);
        fw.write("\n Hello wrold");
        fw.write("java programming");
        fw.flush();
        fw.close();
            System.out.println("Done !!!");
            
             // File reader 
        FileReader fr = new FileReader("D:\\Core_Java\\Practical_File\\FileHandling\\text.txt") ;    
        int x ;
        while((x=fr.read())!=-1)
        {
            System.out.print((char)x);
        }
             
        
        }
       
        
    
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
