package pack1;
import pack2.*;
class GreetDemo extends Greet
{
public void show()
{
greet();
}
public static void main(String[]args)
{
GreetDemo obj=new GreetDemo();
obj.show();
}
}