

import java.util.Scanner;

public class JavaGradeProgram
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
      System.out.println("What is your grade?");
      int grade = input.nextInt();
      if (0 <= grade && grade <= 100)
         {
            if (90 <= grade)
               {
                  System.out.print("Your grade is an A.");
               }
            else if (80 <= grade)
               {
                  System.out.print("Your grade is a B.");
               }
            else if (70 <= grade)
               {
                  System.out.print("Your grade is a C.");
               }
            else if (60 <= grade)
               {
                  System.out.print("Your grade is a D.");
               }
            else
               {
                  System.out.print("Your grade is an F.");
               }
           }
      else
         {
            System.out.print("That is not a valid grade.");
         }
	}
}