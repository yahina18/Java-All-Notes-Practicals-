/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception_handling;

import java.util.Scanner;

class PassWordMismatchException extends Exception
{
    PassWordMismatchException()
    {
        super("The enterd Password is incorrect!!!");
    }
}
class PassWordVerificationExpired extends Exception
{
    PassWordVerificationExpired()
    {
        super("The Password entered more than three times!!!");
    }
}


public class Password_Verification {
    
    
    String pass;
    static int count=0;
    
    Password_Verification(String pass)
    {
        this.pass = pass;
    }
    
    public void getPassword()
    {
        String Userpass;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Password:");
        Userpass = s.nextLine(); 
    
       try 
       {
           count++;
           if(Userpass.equals(pass))
           {
                DisplayMsg("Welcome!!!");
           }
           else
           {
               if(count==3)
               {
                 throw new PassWordVerificationExpired();
               }
               else
               {
                 throw new PassWordMismatchException();
               }
           }
        }
      catch(PassWordMismatchException | PassWordVerificationExpired e)
       {
           if(e instanceof PassWordMismatchException )
           {
             
               System.out.println(e);
               getPassword();
           }
           else
           {
               System.out.println(e);
           }
       }
       
       
    }
      
    public void DisplayMsg(String msg)
    {
        System.out.println(msg);
    }
 
}
