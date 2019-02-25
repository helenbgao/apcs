
public class piCalc2
{
	public static void main (String args[])
	{
      double d = 1;
      double n = 4;
      double pi = 0;
	   for (int i = 0; i < 2147483647; i ++)
         {
            pi += n/d;
            n *= -1;
            d += 2;
         }
      System.out.print("Pi = " + pi);
	}
}