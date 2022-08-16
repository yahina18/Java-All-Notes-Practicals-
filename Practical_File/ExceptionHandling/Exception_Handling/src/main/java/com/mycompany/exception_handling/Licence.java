/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception_handling;
 
import java.time.LocalDate;
import java.time.Period;

class AgeNotValid extends Exception
{
    AgeNotValid()
    {
        super("You are not eligible for driving!!!");
    }
}
public class Licence {
    
    String name;
    String DOB;
    
  public Licence(String name, String DOB)
    {
        this.name=name;
        this.DOB = DOB;
       
  }
 
  public void canDrive() throws AgeNotValid
  {
      LocalDate dob = LocalDate.parse(DOB); // the take the date int yyyy-mm-dd forat
      
      int years  = calculate_age(dob);
      if(years >= 18)
      {
          System.out.println("You are Eligible for Driving!!!");
      }
      else
      {
          throw new AgeNotValid();
      }
     
  }
  public int calculate_age(LocalDate dob)
  {
      LocalDate cur_date = LocalDate.now();
      
      if(dob != null && cur_date != null)
      {
          return Period.between(dob, cur_date).getYears();
      }
      else
      {
          return 0;
      }
  }
    
}
