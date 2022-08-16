/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.multithreadingpracticals;

class SharedData 
{
    private int n;
    private boolean writeable = true;
    public synchronized void set(int n) throws InterruptedException
    {
        if(writeable==false)
          wait();
        this.n = n;
        System.out.println("Producer:" +n);
        writeable = false;
        notify();
        
    }
    public synchronized int get() throws InterruptedException
    {
        if(writeable == true)
             wait();
        writeable =true;
        notify();
        System.out.println("Consumer: "+n);
        return n;
    }
}
class Producer extends Thread
{
    SharedData s;
    Producer(SharedData s)
    {
        this.s = s;
    }
    public void run()
    {
        try
        {
            for(int i=1; i<=10;i++)
            {
                s.set(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
class Consumer extends Thread 
{
    SharedData s;
    Consumer(SharedData s)
    {
        this.s = s;
    }
    public void run()
    {
        int sum=0;
        int x;
        try
        {
            do
            {
                x = s.get();
                sum+=x;
            }
            while(x!=10);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Producer_Consumer_Practical {

   
    public static void main(String[] args) {
        
        SharedData obj =new SharedData();
        Producer  P = new Producer(obj);
        Consumer C = new Consumer(obj);
        P.start();
        C.start();
        
        
    }
    
}
