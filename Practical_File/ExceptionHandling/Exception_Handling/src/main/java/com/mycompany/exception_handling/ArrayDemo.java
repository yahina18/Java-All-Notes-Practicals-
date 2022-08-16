/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception_handling;

import java.util.Scanner;

class ArrayIndexOutOfBoundException extends Exception
{
    ArrayIndexOutOfBoundException()
    {
        super("ArrayINdexOutOfBooundException");
    }
}

public class ArrayDemo {
    
    int[] arr;
    public void init(int size)
    {
        arr = new int[size];
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a array elements ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = s.nextInt();
        }
        
    }
    public int getValue(int index)
    {
        
        try
        {
        if(index < 0 || index > arr.length-1)
        {
            throw new ArrayIndexOutOfBoundException();
        }
        else
        {
            return arr[index];
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return -1;
    }
}
