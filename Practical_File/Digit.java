import java.util.Scanner;
class Digit
{
   public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a digit and Kth element");
      int n=s.nextInt();
      int k=s.nextInt();
      int count=0;
      while(n!=0)
      {
          int r=n%10;
          count+=1;
          if(count==k)
              System.out.println(r);
         n/=10;
      }
  }
}