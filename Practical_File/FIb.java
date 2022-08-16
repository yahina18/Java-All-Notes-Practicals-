import java.util.Scanner;
class fib
{
  public static void main(String[]args)
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter a size of array");
 int [] arr=new int[s.nextInt()];
System.out.println("Enter a element of array");
for(int i=0;i<arr.length;i++)
{
 arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++)
{
 System.out.println(arr[i]);
}
 int count=0;
outer : for(int i=0;i<arr.length;i++)
       {
              int x=arr[i];
                for(int k=0;k<=x;k++)
                {
                         int a=0,b=1,c=0;
                         c=a+b;
                         if(c==x)
                        {
                                System.out.println(x+"fibonacci term");
                                 count++;
                                continue outer;
                        }
                        a=b;
                        b=c;
                 }
       }
System.out.println(count);
}
}