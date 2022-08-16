class Mark
{
 public static void main(String[]args)
{
  int Mark=0;
  for(int i=0;i<5;i++)
{
     Mark+=Integer.parseInt(args[i]);
}
System.out.println("Marks is="+Mark);
float per=0.0f;
per=((Mark/500)*100);
System.out.println("Percentage is="+per);

}
}