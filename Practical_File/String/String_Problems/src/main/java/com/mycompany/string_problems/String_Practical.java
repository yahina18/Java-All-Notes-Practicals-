/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.string_problems;

import java.util.Arrays;
import java.util.Scanner;
class Rotation_of_String{
    public void rotation(char[]arr,int length,String str2)
    {
        String str1=null;
        int rotation=0;
        char ch='\u0000';
        int last_index=arr.length-1;
        while(rotation<=arr.length-1)
        {
            for(int i=last_index;i>0;i--)
            {
                ch=arr[last_index];
                arr[i]=arr[i-1];
            }
            arr[0]=ch;
            str1=String.valueOf(arr);
            if(str2.equals(str1))
            {
                System.out.println(str2+" is the rotation of another string "+str1);
            }
            else
                rotation++;
            
        }
        if(rotation>arr.length)
            System.out.println(str2+" is the not rotation of another string "+str1);
    }
}
class Reverse_Strings
{
    public String reverse_str(String str)
    {
        char [] arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String str1=String.valueOf(arr);
        return str1;
    }
    
}
class Remove_adjacent{
    
    public String Remove(String str)
    {
        char [] arr1=str.toCharArray();
        char [] arr2=new char[str.length()];
        int i=0,j=0;
        while(i<str.length())
        {
            if(i==0 && j==0)
            {
                arr2[j]=arr1[i];
                i++;
            }
            else if(arr1[i]==arr2[j])
            {
                if(j==0 && i>0)
                {
                    i++;
                    arr2[j]=arr1[i];
                    i++;
                   
                }
                else
                {
                    i++;
                    j--;
                }
                   
            }
            else
            {
               ++j;
                arr2[j]=arr1[i];
                i++;
            }
        }
        String res=String.valueOf(arr2);
        return res;
    }
    
}
class New_Word_in_newLine{
    public void new_word(String str)
    {
        for(int i=0;i<=str.length()-1;i++)
        {
            if(i!=0 && Character.isUpperCase(str.charAt(i)))
                System.out.println();
            
        System.out.print(str.charAt(i));
        }
    }
}
class Frequency_character{     //not bad one need a improvement 
    public void Max_frequency(String str)
    {
       char [] arr= str.toCharArray();
       int i=1,count=1;
       while(i<arr.length)
       {
        if(arr[i]==arr[i+1])
        {
            count++;
           
        }
        else
        {
            if(count==1)
                System.out.println(arr[i]+" ");
            else
                System.out.println(arr[i]+" "+count);
            
            count=1;
           
        }
        i++;
       
       }
    }
    
}
class Max_Frequency_Character
{
    public void Max_char(String str)
    {
        char [] arr=str.toCharArray();
        int cur_count=0;
        int max_count=0;
        char ch='0';
        for(int i=0;i<str.length()-1;i++)
        {
            cur_count=1;
            for(int j=i;j<str.length()-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    cur_count++;
                }
            }
            if(cur_count>max_count)
            { 
                max_count=cur_count;
                ch=arr[i];
            }
               
        }
        System.out.println("The Maximum frequency of the character is " +"'"+ch+ "'"+ " Present:"+max_count);
    }
}
class cmp_string{
    public StringBuffer comp_string(String str1,String str2)
    {
        StringBuffer sb=new StringBuffer("");
        int i=0,j=0;
        while(i<str1.length() && j<str2.length())
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(j);
            if(ch1!=ch2)
                sb.append("1");
            else
                sb.append("0");
            
            i++;
            j++;
        }
        while(i<str1.length())
        {
            sb.append(str1.charAt(i));
            i++;
        }
           while(j<str1.length())
        {
            sb.append(str1.charAt(j));
            j++;
        }
        return sb;
        
    }
}
class Piyush_Magical_Park
{
    public void magical_park(char[][]arr,int k,int strength)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                char ch=arr[i][j];
                if(ch=='.')
                {
                    strength-=2;
                    
                }
                else if(ch=='*')
                {
                    strength+=5;
                }
                else
                {
                    break;
                }
                if(j!=arr[0].length-1)
                    strength--;
            }   
        }
        if(strength<k)
            System.out.println("NO Piyush loss in the park!!!");
        else
        {
           System.out.println("yess Piyush successfully reach te house!!!  strength="+strength);
           
        }                       
    }
}
public class String_Practical {

   
    public static void main(String[] args) {
    
       char [][]arr={{'.','.','*','.'},{'.','#','.','.'},{'*','*','.','.'},{'.','#','*','*'}};
       Piyush_Magical_Park obj=new Piyush_Magical_Park();
       int k=5;int s=20;
       obj.magical_park(arr, k, s);
      /*  Frequency_character obj=new Frequency_character();
        String str="aaabbccde";
        obj.Max_frequency(str);
        
        
        
      /*  cmp_string obj = new cmp_string();
        String str1="110100";
        String str2="100111";
        
        StringBuffer str=obj.comp_string(str1, str2);
        System.out.print(str);
       /*String str="abbaaccaea"; 
       Max_Frequency_Character obj=new  Max_Frequency_Character();
       obj.Max_char(str);
      /*  String str="IAmACompetitiveProgrammer"; 
        New_Word_in_newLine obj=new New_Word_in_newLine();
       obj.new_word(str);
        
        
        /* String str="aaabbccde";
        Frequency_character obj=new Frequency_character();
        obj.Max_frequency(str);
        */
        
        
       // String str="azxxzy";
        
      //  Remove_adjacent obj=new Remove_adjacent();
     //   System.out.println(obj.Remove(str));
       // String str="Hina is my name";
       // String str2=new StringBuffer(str).reverse().toString();
      //  System.out.println(str2);
     //  char [] arr=str.toCharArray();
     //    String str2="";
    /*   for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==' ')
           {
               String str1=String.valueOf(arr);
               String temp=new StringBuffer(str1).reverse().toString();
             
               str2.concat(temp);
           }
       }
       System.out.println(str2);
 
  /*   Scanner s=new Scanner(System.in);   
     String str1="mypencil";
     String str2="encilmyp";
     if(str1.length()!=str2.length())
          System.out.println(str1+" is the not rotation of another string "+str1);
     else
     {
         Rotation_of_String obj=new Rotation_of_String();
         char []arr=str1.toCharArray();
         int length=arr.length;
         obj.rotation(arr, length, str2);
     }
   
    /* Reverse_Strings obj=new Reverse_Strings();
     String str2=obj.reverse_str(str1);
     
     if(str1.equalsIgnoreCase(str2))
         System.out.println("Given Strings is palindrome string");
     else
         System.out.println("Given Strings is not palindrome string"); 
         
    */
    
    }
    
}
