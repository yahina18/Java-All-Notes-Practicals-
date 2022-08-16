import java.util.Scanner;
class Student
{
private int id;
private String name;
public int TM;
public Student()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter a student name, id and Total Mark");
id=s.nextInt();
s.nextLine();
name=s.nextLine();
TM=s.nextInt();
}
public void display()
{
 System.out.println("Student Name="+name);
 System.out.println("Student id="+id);
 System.out.println("Student Total Mark="+TM);
}
 
}
class Student1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a Student no.");
Student[]arr=new Student[s.nextInt()];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter a Student"+(i+1)+"Details");
arr[i]=new Student();
}
for(int i=0;i<arr.length;i++)
{
System.out.println("Student"+(i+1)+"Details");
arr[i].display();
int tm=0;
for(Student s1:arr)
{
      int total_Mark=s1.TM;
   if(tm<total_Mark)  
   {
   	if(tm<total_Mark)
                      tm=total_Mark; 
     }
}
System.out.println("Higest Mark="+tm);
for(Student s2:arr)
{
   int total_Mark=s2.TM;
   if(tm==total_Mark)
   {
       System.out.println("Topper");
       s2.display();
   }
}
}
}
}