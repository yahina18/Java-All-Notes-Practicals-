/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lambdaexpression;

interface functionality
{
    public int operator(int x , int y);
}
class operation
{
    public void perform(functionality obj)
    {
        System.out.println(obj.operator(10, 20));
    }
}
public class LambdaExpression {

   
    public static void main(String[] args) {
       operation o = new operation();
       functionality obj=(x,y)->x+y;
      // o.perform(obj);
     //  o.perform((x,y)->x-y);
       o.perform((x,y)->x/y);
    }
    
}
