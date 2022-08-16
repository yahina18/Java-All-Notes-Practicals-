/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.multithreadingpracticals;

class Table
{
    public synchronized void PrintTable(int data)
    {
        for(int i=1; i<=10;i++)
        {
            System.out.println(i*data);
        }
    }
}
class Threads1 extends Thread
{
    Table t;
    Threads1(Table t)
    {
        this.t = t;
    }    
    public void run()
    {
        t.PrintTable(5);
    }
}
class Threads2 extends Thread
{
    Table t;
    Threads2(Table t)
    {
        this.t = t;
    }    
    public void run()
    {
        t.PrintTable(6);
    }
}
public class Mutual_ExclusivePract {

    
    public static void main(String[] args) {
     
        Table t = new Table();
        Threads1 th1 = new Threads1(t);
        Threads2 th2 = new Threads2(t);
        th1.start();
        th2.start();
        
    }
    
}
