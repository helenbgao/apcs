/*  Write a program which asks the user how many players will be on each
soccer team; the number should be between 14 - 20.  Next ask the user
how many players have signed up for the league; the number should be 
between 70 and 250.
   Output the number of soccer teams and the player left over that are
   not on a team.

*/
import java.util.Scanner;


public class SoccerTeam
{
	public static void main (String args[]) 							
	{  
 		Scanner input = new Scanner(System.in);
      System.out.println("How many players are on each soccer team?");
      int players = input.nextInt();
      System.out.println("How many players signed up for the league?");
      int total = input.nextInt();
      System.out.print("There are " + total/players + " soccer teams. " + total%players + " players are not on a team.");
	}
}