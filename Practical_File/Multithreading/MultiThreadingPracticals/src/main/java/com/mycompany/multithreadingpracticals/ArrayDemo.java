/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multithreadingpracticals;

class add extends Thread
{
    int [] arr;
    add(int[] arr)
    {
        this.arr = arr;
    }
    public void run()
    {
        int sum=0;
        for(int i=0; i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum is:"+sum);
    }
}
class sub extends Thread
{
    int [] arr;int k;
    sub(int[] arr,int k)
    {
        this.arr = arr;
        this.k = k;
    }
    public void run()
    {
       
        for(int i=0; i<arr.length;i++)
        {
            System.out.println("Sub :" +(arr[i]-k));
        }
        }
}
class Multi extends Thread
{
    int [] arr; int prod =1;
    Multi(int[]arr)
    {
        this.arr =arr;
     
    }
    public void run()
    {
        for(int i=0;i<arr.length;i++)
        {
            prod*=arr[i];
            System.out.println("Multiplication:"+prod);
        }
    }
}
class div extends Thread
{
    int[]arr; int div=2;
    div(int[]arr)
    {
        this.arr = arr;
    }
    public void run()
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Division :" +arr[i]/div);
        }
    }
}
public class ArrayDemo {
    
}
