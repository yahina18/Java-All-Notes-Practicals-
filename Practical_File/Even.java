import java.util.Scanner;

class Even
{
public static void main(String[]agrs)
{
     Scanner s =new Scanner(System.in);
     System.out.println("Enter a two no. and P value");
     int n1=s.nextInt();
     int n2=s.nextInt();
    int p=s.nextInt();
   int count=0;
  for(int i=n1;i<=n2;i++)
{
   if(i%2==0)
   {
      count++;
      if(count==p)      
      {
             count=0;
             System.out.println(i);
      }
   }
}
}
}