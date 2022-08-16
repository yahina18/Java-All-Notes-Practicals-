/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception_handling;

class ComplexNumberException extends Exception
{
    ComplexNumberException()
    {
        super("The number is invalid number");
    }
}
public class Find_Sqrt {
    
    
    double n;
    Find_Sqrt(double n)
    {
        this.n = n;
    }
    
    public void calculate_sqrt() throws ComplexNumberException
    {
        double num = Math.sqrt(n);
        if(num > 0)
        {
            System.out.print( "The Sqrt of the number:" +num);
        }
        else
            
        {
            throw new ComplexNumberException();
        }
    }
}
