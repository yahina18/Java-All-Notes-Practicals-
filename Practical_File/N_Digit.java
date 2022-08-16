import java.util.Scanner;
class N_Digit
{
 public static void main(String[]args)
{
       Scanner s=new Scanner(System.in);
       System.out.println("Enter n digit");
       int n=s.nextInt();
      int rem=0,count=0;
      int x=n;
      while(n!=0)
      {
           rem=n%10;
           count+=1;
           n=n/10;
      }
int k=count;
int[]arr=new int[count];
while(count!=0)
{
   rem=x%10;
   arr[count-1]=rem;
   x/=10;
  count--;
}
int sum=0,avg=0;
for(int j=0;j<arr.length;j++)
{
sum+=arr[j];
System.out.println(arr[j]);
 
}
avg=sum/k;
System.out.println("Sum of arr="+sum+"Avg. of arr"+avg);
}
}