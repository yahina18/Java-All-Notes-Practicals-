import java.util.Scanner;
class Budget
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int []arr=new int[12];
int sum;
for(int i=0;i<arr.length;i++)
{
sum=0;
System.out.println("Enter month"+(i+1)+"item");
int item=s.nextInt();
for(int j=0;j<item;j++)
{
System.out.println("Enter price"+(j+1));
sum+=s.nextInt();
}
arr[i]=sum;
}
int max=0;
for(int k=0;k<arr.length;k++)
{
if(max<arr[k])
         max=arr[k];
}
for(int i=0;i<arr.length;i++)
{
if(max==arr[i])
{
System.out.println("Maximum expense"+max+"In month"+i);
}
}
}
}