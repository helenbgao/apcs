/* Craps is a popular Las Vegas game of dice in which a designated player rolls
two die one or more times.  After each roll the sum of the die is computed.
If the sum is 2,3, or 12, the game ends and the player loses. If the sum is 7
or 11 on the first roll, the game is over and the player wins. However if a 7
comes up on a subsequent roll, the game is over and the player loses.
If the sum of the first roll is 4,5,6,8,9 or 10, then the number is called the
 point. If the player rolls the point on a subsequent roll, then the game ends
  and the player wins. In otherwords, the goal of craps is to roll the point 
  before losing.
 
Implement a computer Craps game.
*/
import java.util.Random;
public class Craps
{
	public static void main(String args[])
	{  
      double wins = 0.0;
      double losses = 0.0;
      int total = 10000;
      int sum;
      int point;
      boolean win;
      boolean game;
      Random rand = new Random();      
      for (int i=0; i<total; i++)
      {
      game = true;
      sum = (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
      point = sum;
      if (sum==2 || sum==3 || sum==12)
      {
         win = false;
         game = false;
         losses++;
      }
      else if (sum==7 || sum==11)
      {
         win = true;
         game = false;
         wins++;
      }
      else
      {
      while (game==true)
      {
         sum = (rand.nextInt(6)+1) + (rand.nextInt(6)+1);
         if (sum==7)
         {            
            win = false;
            losses++;
            game = false;
         }
         else if (sum==point)
         {
            win = true;
            wins++;
            game = false;
         }       
         else
         {
            game = true;
         } 
      }
      }
      }
      System.out.println("You won " + wins + " times, or " + wins/total + "% of the time.");
      System.out.println("The casino won " + losses + " times, or " + losses/total + "% of the time.");
	}	
}