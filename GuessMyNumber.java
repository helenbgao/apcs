import java.util.Random;
import java.util.Scanner;
public class GuessMyNumber
{
	public static void main (String args[])
	{
	   Random rand = new Random();
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Guess My Number! Please enter the lowest and highest numbers for the range.");
      int low = input.nextInt();
      int high = input.nextInt();
      int number = rand.nextInt(high-low+1) + low;
      System.out.println("I've got a number between " + low + " and " + high + ". Please enter a guess.");
      int guess = input.nextInt();
      int lowest = guess;
      int highest = guess;
      double total = 0;
      double sum = 0;
      while (guess != number)
         {
            total++;
            sum += guess;
            while (guess < low || guess > high)
               {
                  if (guess < lowest)
                     {
                        lowest = guess;
                     }
                  else if (guess > highest)
                     {
                        highest = guess;
                     }                  
                  System.out.println("Please enter a number between " + low + " and " + high + ".");
                  guess = input.nextInt();
               }
            if (guess < number)
               {
                  if (guess < lowest)
                     {
                        lowest = guess;
                     }
                  System.out.println("Your guess was too low. Guess again!");
                  guess = input.nextInt();
               }
            else
               {
                  if (guess > highest)
                     {
                        highest = guess;
                     }
                  System.out.println("Your guess was too high. Guess again!");
                  guess = input.nextInt();
               }
            }
            total++;
            sum += guess;
            double average = sum/total;
            System.out.println("Congratulations, you guessed the number!");
            System.out.print("The lowest number entered was " + lowest + ". The highest number entered was " + highest + ". The average number entered was " + average + ".");
	}
}