import java.util.Scanner;
class PN
{
public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a size of array");
    int[] arr=new int[s.nextInt()];
    System.out.println("Enter a Element of array ");
    for(int i=0;i<arr.length;i++)
{
   arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++)
{
int temp=0;
for(int j=i;j<arr.length;j++)
{
if(arr[i]<0)
{
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
}
}
}
  for(int i=0;i<arr.length;i++)
{
   System.out.println(arr[i]);
}
    
}
}