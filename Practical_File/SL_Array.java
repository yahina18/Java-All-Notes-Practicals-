import java.util.Scanner;
class SL_Array
{
   public static void main(String[]args)
{ 
      Scanner s=new Scanner(System.in);
      int [] arr=new int[10];
      System.out.println("Enter a element of array");
      for(int i=0;i<arr.length;i++)
      {
             arr[i]=s.nextInt();

      }
int temp;
for(int j=0;j<arr.length;j++)
{
     for(int k=j+1;k<arr.length;k++)
     {
           if(arr[j]>arr[k])
           {
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
           }
     }
}
System.out.println("Smallest element of array"+arr[0]+"Largest element of array"+arr[9]);
}
}