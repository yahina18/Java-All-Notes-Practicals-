import java.util.Scanner;
class PR_NO
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a lower limit");
int x=s.nextInt();
System.out.println("Enter a upper limit");
int y=s.nextInt();
outer : for(int i=x;i<=y;i++)
	{
 		for(int j=2;j<i;j++)
  	                  {
                                             if(i%j==0)
                                             continue outer;
                                    } 
                   System.out.println(i);
                  }

}
}