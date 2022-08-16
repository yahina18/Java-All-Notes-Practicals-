import java.util.Scanner;
class Array_PRM
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
         int count;
         for(int j=0;j<arr.length;j++)
         {    int x=arr[j];
               count=0;
              for(int k=0;k<arr.length;k++)
              {
                      if(x==arr[k])
                            count+=1;
              }
           if(count>0)
                   System.out.println(x+"is present" +count+"time");
          else
                 System.out.println(x+"is present 1 time");   
          }
         
   }
}