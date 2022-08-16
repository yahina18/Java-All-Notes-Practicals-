/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author HP
 */
public class Buffer_Writer_Reader_Practical {

    
    public static void main(String[] args) {
       try
       { 
           //buffered writer
           BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Core_Java\\Practical_File\\FileHandling\\txt1.txt"));
           bw.write(65);
           bw.newLine();
           bw.write("Hello welocome to java");
           bw.newLine();
           bw.write("b");
           bw.newLine();
           bw.flush();
           bw.close();
           System.out.println("Done!!!");
           
           //buffered reader
           BufferedReader br = new BufferedReader(new FileReader("D:\\Core_Java\\Practical_File\\FileHandling\\txt1.txt"));
            
           String str;
           while((str=br.readLine())!= null)
           {
               System.out.print(str);
           }
           
           
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    
}
