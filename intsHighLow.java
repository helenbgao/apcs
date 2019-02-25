/*	Write a program using the scanner class which asks the user to enter 3 positive integers; output the
smallest, middle, and largest number.  You cannot use the Math class for this assignment.
*/
import java.util.Scanner;
public class intsHighLow
{
	public static void main (String args[])
	{
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter three unique positive integers.");
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
		
      if ((a < b) && (b < c))
         { 
            System.out.print(a + ", " + b + ", " + c);
         }
      else if ((a < c) && (c < b))
         {
            System.out.print(a + ", " + c + ", " + b);
         }
      else if ((b < a) && (a < c))
         { 
            System.out.print(b + ", " + a + ", " + c);
         }
      else if ((b < c) && (c < a))
         { 
            System.out.print(b + ", " + c + ", " + a);
         }
      else if ((c < a) && (a < b))
         { 
            System.out.print(c + ", " + a + ", " + b);
         }
      else
         { 
            System.out.print(c + ", " + b + ", " + a);
         }
   }
}