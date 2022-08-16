/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.multithreadingpracticals;
class Thread1 extends Thread
{
    Addition a;
    
    Thread1(Addition a)
    {
        this.a = a;
    }
    public void run()
    {
        for (int i=1; i<=5;i++)
        {
          a.add_num(i);
        }
    }
}
class Thread2 extends Thread
{
    Addition a;
   
    Thread2(Addition a)
    {
        this.a = a;
    }
    public void run()
    {
        for (int i=6; i<=10;i++)
        {
              a.add_num(i);
        }
    }
}
class Addition
{
    int num=0;
    public synchronized void  add_num(int i)
    {
        num=num+i;
    } 
}
public class AdditionPrgm {

   
    public static void main(String[] args) throws InterruptedException {
       
       Addition add = new Addition();
       Thread1 th1= new Thread1(add);
       Thread2 th2 = new Thread2(add);
       th1.start();
       th2.start();
       th2.join();
       System.out.println("Addition:" +add.num);
    }
    
}
