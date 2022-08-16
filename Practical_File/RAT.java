class RAT
{
public static void main(String[]args)
{
 int x=Integer.parseInt(args[0]);
 int y=Integer.parseInt(args[1]);
 int z=Integer.parseInt(args[2]);
int sum=0;
sum=(x)+(y);
if(sum==z)
System.out.println("It is right angle triangle");
else
System.out.println("It is not right angle triangle");
}
}