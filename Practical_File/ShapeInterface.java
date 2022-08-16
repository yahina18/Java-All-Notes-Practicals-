import java.util.Scanner;
interface Shape
{
public double getArea();
public String getName();
}
class Circle implements Shape
{
double r,area;
String s="circle";
public Circle(double r)
{
  this.r=r;
}
public double getArea()
{
     area=2*3.14*r;
    return area;
}
public String getName()
{
   return s;
}
public void display()
{
  System.out.println("Area"+area);
  System.out.println("Name of shape"+s);
}
}
class Triangle implements Shape
{
double base,heigth,area;
String s="Triangle";
public Triangle(double base, double heigth)
{
  this.base=base;
 this.heigth=heigth;
}
public double getArea()
{
     area=(base*heigth)/2;
    return area;
}
public String getName()
{
   return s;
}
public void display()
{
  System.out.println("Area"+area);
  System.out.println("Name of shape"+s);
}
}
class Square implements Shape
{
double length,width,area;
String s="Sqaure";
public Square(double length, double width)
{
  this.length=length;
 this.width=width;
}
public double getArea()
{
     area=(length*width)*2;
    return area;
}
public String getName()
{
   return s;
}
public void display()
{
  System.out.println("Area"+area);
  System.out.println("Name of shape"+s);
}
}

class Draw
{
      public static void main(String[]args)
     { 
          Scanner s1=new Scanner(System.in);
          System.out.println("Enter circle radius ");
          Circle c=new Circle(s1.nextDouble());
          c.getArea();
         c.display();
        System.out.println("Enter triangle base and heigth:");
        double b=s1.nextDouble();
        double l=s1.nextDouble();
        Triangle t=new Triangle(b,l);
        t.getArea();
        t.display();
        System.out.println("Enter square length and width:");
        double l1=s1.nextDouble();
        double w=s1.nextDouble();
       Square s=new Square(l1,w);
       s.getArea();
      s.display();
     
      }       
}