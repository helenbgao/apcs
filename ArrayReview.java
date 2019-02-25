import java.util.Random;
import java.util.Scanner;
public class ArrayReview
{
	public static void main(String args[])
	{
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("How many random numbers would you like in the array?");
      int n = input.nextInt();
      int nums[] = new int[n];
      for (int i=0; i<n; i++)
      {
         nums[i] = rand.nextInt(21)+30;
         System.out.print(nums[i] + " ");
      }
      System.out.println();
      System.out.println("The highest number is " + highest(nums));
      System.out.println("The lowest number is " + lowest(nums));
      System.out.println("The average is " + average(nums));
      System.out.println("The sum is " + sum(nums));
      System.out.println("The range is " + range(nums));
      System.out.println("Multiples? " + multiples(nums));
	}	
   
   public static int highest(int list[])
   {
      int max = list[0];
      for (int i=0; i<list.length; i++)
      {
         if (list[i]>max)
         {
            max = list[i];
         }
      }
      return max;
   }
   
   public static int lowest(int list[])
   {
      int min = list[0];
      for (int i=0; i<list.length; i++)
      {
         if (list[i]<min)
         {
            min = list[i];
         }
      }
      return min;
   }
   
   public static double average(int list[])
   {
      double sum = 0.0;
      for (int i=0; i<list.length; i++)
      {
         sum += list[i];
      }
      return sum/list.length;
   }
   
   public static int sum(int list[])
   {
      int sum = 0;
      for (int i=0; i<list.length; i++)
      {
         sum += list[i];
      }
      return sum;
   }   
   
   public static int range(int list[])
   {
      int min = list[0];
      int max = list[0];
      for (int i=0; i<list.length; i++)
      {
         if (list[i]>max)
         {
            max = list[i];
         }
         
         if (list[i]<min)
         {
            min = list[i];
         }
      }
      return max-min;
   }
   
   public static boolean multiples(int list[])
   {
      boolean multiples = false;
      for (int i=0; i<list.length; i++)
      {
         for (int j=0; j<i; j++)
         {
            if (list[i]==list[j])
            {
               multiples = true;
            }
         }
      }
      return multiples;
   }
}