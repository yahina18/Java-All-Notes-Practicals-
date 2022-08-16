import java.util.Scanner; 
class Employee
{
private String name;
private int id;
public double sal;
private static int count=0;
private static double com=2500.0;
public Employee()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter name,id and sal");
name=s.nextLine();
id=s.nextInt();
s.nextLine();
sal=s.nextDouble();
count++;
sal+=com;
}

public static void get_Comission()
{
System.out.println(com);
}
public static void get_count()
{
System.out.println(count);
}
public void display()
{
System.out.println("Name="+name);
System.out.println("id="+id);
System.out.println("sal="+sal);
}
}
class Demo1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a Employee no.");
Employee[]arr=new Employee[s.nextInt()];
System.out.println("No.of Employee");
Employee.get_count();
Employee.get_Comission();
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter employee"+(i+1)+"Details");
arr[i]=new Employee();
}
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter employee"+(i+1)+"Details");
arr[i].display();
}
}
}
