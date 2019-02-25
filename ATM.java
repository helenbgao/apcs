
// Write a program which asks the user to input their ATM number.
// Use 1234 as the correct number; this will require the use of a while statement.
//  Keep track of the number of 
// guesses and the percent of correct entries; for example, if
// the user took 3X to enter the correct number, than the percent
// would be 33%.
// Also, if the user tries more than 5X, than exit the program with
// a message asking the user to quit trying to hack into the account.
import java.util.Scanner;

public class ATM
{
	public static void main (String args[]) 							
	{   
	  Scanner input = new Scanner(System.in);
     System.out.println("Please enter your ATM number.");
     int atm = input.nextInt(); 
     int tries = 1;
     
     while (atm != 1234)
      {
         System.out.println("That is the wrong ATM number. Please try again.");
         tries ++;
         atm = input.nextInt();
         
         if (tries >= 5)
            {
               System.out.print("You have entered the incorrect number five times. Please stop trying to hack into the account.");
               System.exit(0);
            }
      }
      
      System.out.println("Access granted.");
      System.out.print("It took " + tries + " tries to enter the correct number.");
      
   }
}