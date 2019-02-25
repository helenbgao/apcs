/**
 * Write a program which shuffles a set of 52 cards.
 */
import java.util.Random;
public class CardProblem1 
{
    public static void main(String[] args)
    {
      Random rand = new Random();
      String card [] = {"AS","2S","3S","4S","5S","6S","7S","8S","9S","10S", "JS","QS", "KS","AC","2C","3C","4C","5C","6C","7C","8C","9C","10C" ,"JC","QC", "KC"};
      boolean taken[] = new boolean[card.length];
      for (int i=0; i<card.length; i++)
      {
         int num = rand.nextInt(card.length);
         while (taken[num]==true)
         {
            num = rand.nextInt(card.length);
         }
         System.out.print(card[num] + " ");
         taken[num] = true;
      }    
    }    
}