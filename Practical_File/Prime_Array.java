import java.util.Scanner;
class Prime_Array
{
 public static void main(String[]args)
{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter a size of array");
   int[]arr=new int[s.nextInt()];
   System.out.println("Enter a element of array");
   for(int i=0;i<arr.length;i++)
 { 
   arr[i]=s.nextInt();
 }
int count=0, i;
for(int j=0;j<arr.length;j++)
{
    int x=arr[j];
for(i=2;i<x;i++)
{
  if(x%2==0)
  break;
}
if(i==x)
count+=1;

}
System.out.println("Total Prime NO. in array"+count);
}
}