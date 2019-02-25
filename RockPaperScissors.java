import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors
{
	public static void main (String args[])
	{
		Random rand = new Random();
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to rock, paper, scissors! enter 1 for rock, 2 for scissors, 3 for paper, and 4 to quit.");
      int user = input.nextInt();
      int computer = rand.nextInt(3) + 1;
      double total = 0;
      double compwins = 0;
      int rock = 0;
      int scissors = 0;
      int paper = 0;
      
      while (user != 4)
      {
         total ++;
         
         while (user < 1 || user > 4)
         {
            System.out.println("Please enter 1, 2, 3, or 4.");
            user = input.nextInt();
         }
         
         if (computer == 1)
            {
               rock ++;
            }
         if (computer == 2)
            {
               scissors ++;
            }
         if (computer == 3)
            {
               paper ++;
            }
      
         if ((user == 1 && computer == 2) || (user == 2 && computer == 3) || (user == 3 && computer == 1))
            {
               System.out.println("Congratulations, you won! Play again?");
            }
         else if (user == computer)
            {
               System.out.println("It was a tie. Play again?");
            }
         else
            {
               System.out.println("Sorry, you lost. Play again?");
               compwins ++;
            }
         user = input.nextInt();
         computer = rand.nextInt(3) + 1;
      }
      
      double wins = compwins/total;
      System.out.println("The computer won " + (wins*100) + "% of the time.");
      System.out.print("The computer selected rock " + rock + " times, paper " + paper + " times, and scissors " + scissors + " times.");
	}
}