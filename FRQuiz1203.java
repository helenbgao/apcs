public class FRQuiz1203
{
	public static void main (String args[])
	{
		int[] numbers = {11,22,33,44,100,2,55,66,77,88,99};
		System.out.println(getMin(numbers));
      System.out.println(getMax(numbers));
	}
	
   public static int getMin(int[] list)
   {
      int min = list[0];
      for (int i=1; i<list.length; i++)
      {
         if (list[i] < min)
         {
            min = list[i];
         }
      }
      return min;
   }	
   
   public static int getMax(int[] list)
   {
      int max = list[0];
      for (int i=1; i<list.length; i++)
      {
         if (list[i] > max)
         {
            max = list[i];
         }
      }
      return max;
   }		
}