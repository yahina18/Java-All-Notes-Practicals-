interface Convertor
{
   int Km_To_M=1000;
   int M_to_CM=100;
   int CM_to_MM=10;
}
class Convert implements Convertor
{
   public double K_to_M(double x)
  {
       return x*Km_To_M;
  }
 public double m_to_cm(double x)
  {
       return x*M_to_CM;
  }
public double cm_to_mm(double x)
  {
       return x*CM_to_MM;
  }
}
class Convert_Demo
{
  public static void main(String[]args)
  {
       java.util.Scanner s=new java.Scanner(System.in);
        Convert c=new Convert();
         System.out.println("Enter Kilometre");
        double x=c.K_to_M(s.nextDouble());
        System.out.println("K_TO_M="+x);
       System.out.println("Enter centimetre");
        double y=c.cm_to_mm(s.nextDouble());
        System.out.println("CM_TO_MM="+y);
   System.out.println("Enter metre");
        double z=c.m_to_cm(s.nextDouble());
        System.out.println("M_TO_CM="+z);
  }
}