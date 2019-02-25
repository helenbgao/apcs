import java.util.Scanner;
public class FRQuiz1002st
{
	public static void main (String args[])
	{		
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number to which you want to calculate a perfect number.");
      int ans = input.nextInt();
      System.out.println("The perfect numbers up to " + ans + " are:");
      perfect(ans);
	}
   
   public static boolean isPerfect(int num)
   {
      int sum = 0;
      for (int i=1; i<num; i++)
      {
         if (num%i==0)
         {
            sum+=i;
         }
      }
      
      if (sum==num)
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
   public static void perfect(int n)
   {
      for (int i=1; i<n; i++)
      {
         if (isPerfect(i) == true)
         {
            System.out.print(i + " ");
         }
      }
   }
}