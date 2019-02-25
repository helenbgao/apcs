// Utilizing the information from the UNC handout, ask the user for the following information:
// User's name; User's Income; User's GPA; & if user is a instate resident.
//Utilizing the information, display whether the user is accepted; make sure to display the information
// as shown in the handout.

import java.util.Scanner;

public class UNCAdmissions
{
	public static void main (String args[])
	{
 		Scanner keyboard  = new Scanner(System.in);
	   System.out.println("What is your name?");
      String name = keyboard.nextLine();
      System.out.println("If you are an in-state resident, enter 1. If not, enter 0.");
      int resident = keyboard.nextInt();
      System.out.println("What is your GPA?");
      double gpa = keyboard.nextDouble();
      System.out.println("What is your income?");
      double income = keyboard.nextDouble();

      if (gpa > 3.5 || (gpa > 3.5 && resident == 1) || (gpa > 3.0 && gpa < 3.5 && resident == 0 && income > 50000) || (gpa > 2.5 && gpa < 3.0 && resident == 1 && income < 30000) || (gpa > 2.0 && gpa < 2.5 && resident == 1 && income < 15000))
         {
            System.out.println(name + " is admitted.");
            
            if (resident == 1 && gpa > 3.0 && income < 15000)
               {
                  System.out.print(name + " should be offered a scholarship.");
               }
            else if (resident == 1 && gpa > 3.0 && income > 15000 && income < 30000)
               {
                  System.out.print(name + " should be offered a loan.");
               }
         }
      
      else
         {
            System.out.print(name + " is not admitted.");
         }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
  	}

}