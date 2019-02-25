import java.util.Scanner;
public class Factors
{
	public static void main (String args[])
	{		
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number for the computer to factor:");
      int n = input.nextInt();
      System.out.print("Factors of " + n + ": ");
      for (int a=2; a<n; a++)
      {
         if (n%a==0)
         {
            System.out.print(a + " ");
         }
      }
	}
}
