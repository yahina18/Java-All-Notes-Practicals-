class Parent
{
public int x;
protected int y;
int z;
private int p;
public Parent()
{
x=10;
y=20;
z=30;
p=40;
  
}
static
{
 System.out.println("Parent Static BLock");
}

}
class Child extends Parent
{
private int a;
private int b;

{
 a=100;
b=200;
}
static
{
 System.out.println("Child Static BLock");
}
public Child()
{
System.out.println("Constructor Called");
}
public void show()
{
System.out.println(x+" "+y+" "+z+" "+a+" "+b);
}

}
class InDemo
{
public static void main(String[]args)
{
Child obj=new Child();
obj.show();
}
}