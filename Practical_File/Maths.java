import java.util.Scanner;
class Maths
{
public static void main(String[]args)
{ boolean b=true;
while(b!=false)
{ 
 System.out.println("Enter Two No.");
 int x=Integer.parseInt(args[0]);
 int y=Integer.parseInt(args[2]);
 
 switch(args[1])
{
case "+":
      System.out.println(x+y);
      break;
case "-":
      System.out.println(x-y);
      break;
case "X":
      System.out.println(x*y);
      break;
case "/":
      System.out.println(x/y);
      break;
default:
         System.out.println("Invalid Operator ");
}
System.out.println("If you want to continue true else false");
Scanner s=new Scanner(System.in);
b=s.nextBoolean();
break out;
}
}
}
