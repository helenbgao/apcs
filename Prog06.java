// 	Prog06.java
//
// 	Quarters, Dimes and Nickels   
//
//	Weight: 5
//
/////////////////////////////////////////////////////////////////////////
//
//	Write a program that will display all the combinations of Quarters,
//	Dimes and Nickels that add up to 50 cents.
//
//	REQUIRED OUTPUT DISPLAY
//
//	0-Quarters 0-Dimes 10-Nickels
//	0-Quarters 1-Dimes 8-Nickels
//	0-Quarters 2-Dimes 6-Nickels
//	0-Quarters 3-Dimes 4-Nickels
//	0-Quarters 4-Dimes 2-Nickels
//	0-Quarters 5-Dimes 0-Nickels
//	1-Quarters 0-Dimes 5-Nickels
//	1-Quarters 1-Dimes 3-Nickels
//	1-Quarters 2-Dimes 1-Nickels
//	2-Quarters 0-Dimes 0-Nickels
//
/////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Prog06
{
	public static void main(String args[])
	{
      Scanner input = new Scanner(System.in);
      System.out.println("How much change in dollars do you need?");
      double total = input.nextDouble();
      for (int q=0; q<=(total*100/25); q++)
		{
         for (int d=0; d<=(total*100/10); d++)
         {
            for (int n=0; n<=(total*100/5); n++)
            {
               if (25*q + 10*d + 5*n == total*100)
               {
                  System.out.println(q + " quarters, " + d + " dimes, and " + n + " nickels.");
               }
            }
         }
      }		
	}
}