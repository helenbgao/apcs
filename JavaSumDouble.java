
/*Given two int values, return their sum. Unless the two values are the
 same, then return double their sum. Make sure to use a return statement.

sumDouble(1, 2) =  3
sumDouble(3, 2) =  5
sumDouble(2, 2) =  8

*/



public class JavaSumDouble
{
  
	public static void main(String args[])
	{
      System.out.println(sumDouble(1, 2));
      System.out.println(sumDouble(3, 2));
      System.out.println(sumDouble(2, 2));
	}
	
   public static int sumDouble(int a, int b)
   {      
      int sum;
      if (a==b)
      {
         sum = (a+b)*2;
      }
      
      else
         {
            sum = a+b; 
         }
      return sum;
   }

}

	
   

