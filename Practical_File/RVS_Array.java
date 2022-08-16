import java.util.Scanner;
class RVS_Array
{
public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a size of array");
    int [] arr=new int[s.nextInt()];
   for(int i=0;i<arr.length;i++)
   {
            arr[i]=s.nextInt();
   }
System.out.println("Array Element");
for(int i=0;i<arr.length;i++)
{
   System.out.println(arr[i]+" ");
}
int x=0;
int y=arr.length-1;
int temp=0;
while(x!=y)
{
     temp=arr[x];
     arr[x]=arr[y];
     arr[y]=temp;
     x++;y--;
}
System.out.println("Array Element");
for(int i=0;i<arr.length;i++)
{
   System.out.println(arr[i]+" ");
}
}
}