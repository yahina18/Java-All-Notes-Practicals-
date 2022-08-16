/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.multithreadingpracticals;

class addition extends Thread
        
{
    int n;int sum =0;
    addition(int n)
    {
        this.n = n;
    }
    public void run()
    {
        for(int i =0; i<=n;i++ )
        {
            sum+=i;
        }
        System.out.println("Sum is:"+sum);
    }
}
class Multiplication extends Thread
        
{
    int n;int prod =0;
    Multiplication(int n)
    {
        this.n = n;
    }
    public void run()
    {
        for(int i=1; i<=10;i++ )
        {
            prod =i*n;
            System.out.println("Multiplication is:"+prod);
        }
       
    }
}
public class MultiThreading {

   
    public static void main(String[] args)throws Exception {
        
       
        
        
        
        
//        int [] arr ={1,2,3,4,5};
//        ArrayDemo obj = new ArrayDemo();
//        add a = new add(arr);
//        a.start();
//        a.join();
//        sub s = new sub(arr, 2);
//        s.start();
//        s.join();
//        Multi m = new Multi(arr);
//        m.start();
//        m.join();
//        div d =new div(arr);
//        d.start();
//        
        
       
        
        
//        addition add = new addition(10);
//        Multiplication mul = new Multiplication(3);
//        mul.start();
//        add.start();
//        add.join();
//       
        
    }
    
}
