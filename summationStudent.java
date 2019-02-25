
//  Write a program that inputs an integer, n, form the command line and display the string
// "1 + 2 + 3 + 4 + ... + n = sum".  For example if the command line argument is 7, the
// output should be:
// 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
// Make sure the number entered on the commandline is positive.
import java.util.Scanner;
public class summationStudent
{
	public static void main (String args[]) 
	{   	
		Scanner input = new Scanner(System.in);
      System.out.println("Please input a positive integer.");
      int n = input.nextInt();
      int sum = n;
      while (n<1)
      {
         n = input.nextInt();
      }
      
      for (int i=1; i<n; i++)
      {
         System.out.print(i + " + ");
         sum+=i;
      }      
      
      System.out.print(n + " = " + sum);
    }
}