import java.util.Scanner;
class FN35
{
public static void main(String[]args)
{
System.out.println("Enter two no n1 and n2");
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int x=0,y=0;
if(n1==n2)
System.out.println("NOt allow ");
else if(n1>n2)
{
    x=n2;
   y=n1;
   
}
else
{
    x=n1;
    y=n2;
}
for(int i=x;i<=y;i++)
{
if(i%3==0&&i%5==0)
 System.out.println(i);
}
}
}