/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exception_handling;

import java.util.Scanner;


public class Exception_Handling {

   
    public static void main(String[] args) {
        
        
        Account_Manage obj = new Account_Manage("Hina",100000,101);
        
        Scanner s =new Scanner(System.in);
        System.out.println("Select Your Appropriate Options");
        System.out.println("1. Withdraw Money ");
        System.out.println("2. Deposite Your Money");
        int choice = s.nextInt();
          int amt;
        switch(choice)
        {
            case 1:
                System.out.println("Enter amount:");
                amt = s.nextInt();
                obj.Withdraw(amt);
                break;
            case 2:
                System.out.println("Enter amount:");
                amt = s.nextInt();
                obj.deposite(amt);
                break;
            default:
                System.out.println("Invalid choice!!!!");
                
        }
        
        
        
        
//        Scanner s = new Scanner(System.in);
//        ArrayDemo obj = new ArrayDemo();
//        obj.init(5);
//        System.out.println("Enter a index");
//        int index = s.nextInt();
//       int value=obj.getValue(index-1);
//       if(value==-1)
//            System.out.println("invalid index");
//       else
//            System.out.println("Value:" +value);
        
        
//        String Password = "hina123";
//        Password_Verification obj =new Password_Verification(Password);
//        obj.getPassword();
        
        
        
        
//        Find_Sqrt obj =new Find_Sqrt(0);
//        try
//        {
//        obj.calculate_sqrt();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        
//        Licence obj = new Licence("Hina", "2023-01-06");
//        
//         try
//         {
//             obj.canDrive();
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//         
    }
    
}
