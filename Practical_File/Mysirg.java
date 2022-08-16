import java.util.Scanner;
class Mysirg_Accademy
{
   public static void main(String[]args)
  {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number of branch of mysirg");
      int[][]arr=new int[s.nextInt()][];
      for(int i=0;i<arr.length;i++)
      {
          System.out.println("Enter a number of course of"+(i+1)+"branch");
          arr[i]=new int[s.nextInt()];
          for(int j=0;j<arr[i].length;j++)
         {
            System.out.println("Enter a no. of students"+(j+1)+"course");
            arr[i][j]=s.nextInt();     
         }
      }
int sum;
for(int [] brr:arr)
{
     sum=0;
     for(int x:brr)
     {
         sum+=x;
     }
System.out.println(sum);
}
}
}