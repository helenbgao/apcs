import java.util.Random;
public class piCalc
{
	public static void main (String args[])
	{
	   Random rand = new Random();
      double inside = 0;
      double outside = 0;
      for (int i = 0; i < 10000000; i ++)
         {
            double a = rand.nextDouble();
            double b = rand.nextDouble();
            if (Math.sqrt(a*a + b*b) <= 1)
               {  
                  inside++;
               }
            else
               {
                  outside ++;
               }
         }
      double pi = 4*inside/(inside+outside);
      System.out.print("Pi = " + pi);
	}
}