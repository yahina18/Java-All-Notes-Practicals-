/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception_handling;

class InvalidAmountException extends Exception
{
    InvalidAmountException()
    {
        super("The given amount is invallid!!!!");
    }
}
class  InsufficientAmountException extends Exception
{
    InsufficientAmountException()
    {
        super("This much amount not present in your account");
    }
}
public class Account_Manage {
    
    String name;
    int bal;
    int acc_no;
    Account_Manage(String name, int bal, int acc_no)
    {
        this.name = name;
        this.bal = bal;
        this.acc_no = acc_no;
    }
    public void Withdraw(int amount)
    {
        try
        {
        if(amount == 0 || amount < 0)
        {
           throw new InvalidAmountException();
        }
        else if(amount > bal)
        {
            throw new InsufficientAmountException();
        }
        else
        {
            bal = bal - amount;
            System.out.println("Total amoount:" +bal);
            
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void deposite(int amount)
    {
         try
         {
             if(amount > 0)
             {
                 bal = bal + amount;
                 System.out.println("Total Balance:" +bal);
             }
             else
             {
                 throw new InvalidAmountException();
             }
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
        
    }
}
