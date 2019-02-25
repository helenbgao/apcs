

import java.util.Scanner;

public class Javatriangle
{
	public static void main (String args[])
	{

		System.out.println("\nJAVA0509.JAVA\n");
 		Scanner keyboard  = new Scanner(System.in);
	
      System.out.println("What is the shortest side of the triangle?");
      double a = keyboard.nextDouble();
      System.out.println("What is the second shortest side of the triangle?");
      double b = keyboard.nextDouble();
      System.out.println("What is the longest side of the triangle?");
      double c = keyboard.nextDouble();

	   if (c < a + b)
         {
            System.out.println("This is a valid triangle.");
            
            if (a*a + b*b == c*c)
            {
               System.out.print("This is also a right triangle.");
            }
         }
      else
         {
            System.out.print("This is not a valid triangle.");
         }




	}

}
