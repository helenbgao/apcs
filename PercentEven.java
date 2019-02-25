import java.util.Random;
public class PercentEven
{
	public static void main(String args[])
	{
      Random rand = new Random();
      int nums[] = new int[12];
      for (int i=0; i<12; i++)
      {
         nums[i] = rand.nextInt(31)+20;
         System.out.print(nums[i] + " ");
      }
      System.out.println();
      System.out.print(percentEven(nums));
	}	
   
   public static double percentEven(int list[])
   {
      double evens = 0;
      for (int i=0; i<list.length; i++)
      {
         if (list[i]%2==0)
         {
            evens++;
         }  
      }
      double percent = evens/list.length*100;
      return percent;
   }
}