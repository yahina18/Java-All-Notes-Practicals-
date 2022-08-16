class Leap_Year
{
public static void main(String[] args)
{
 int x=Integer.parseInt(args[0]);
 if(x%4==0)
System.out.println("Leap Year");
else
System.out.println("Not a leap");
}
}