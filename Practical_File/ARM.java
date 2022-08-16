import java.util.Scanner;
class ARM
{
   public static void main(String[]args)
{ 
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a digits");
    int n=s.nextInt();
    int sum=0;
    int x=n;
   while(n!=0) 
   {
       int r=n%10;
       sum+=(r*r*r*r);
       n/=10;
   } 
  if(sum==x)
          System.out.println(x+"Number is Armstrong");
else
      System.out.println(x+"Number is not Armstrong");
}
}