import java.util.Scanner;
class Even_Odd
{
  public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a size of Array");
    int [] arr=new int[s.nextInt()];
    System.out.println("Enter a element of array");
    for(int i=0;i<arr.length;i++)
   {
       arr[i]=s.nextInt();
   }
int sum1=0,sum2=0;
for(int j=0;j<arr.length;j++)
{
   if(arr[j]%2==0) 
          sum1+=arr[j];
   else
         sum2+=arr[j];
}
System.out.println("Sum of Even_NO"+sum1+"Sum of Odd_NO"+sum2);
}
}