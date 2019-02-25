/*  Powerball is a lottery played in many of the United States. The lottery numbers are
chosen randomly from two containers of numbered balls. Five white balls are chosen from a 
container of 49 balls, and one red ball is chosen from a container of 42 balls.
Write a program that simulates the selection of the Powerball lottery numbers. Use the 
random function to simulate the random selection of numbered ball. Keep in mind that
you cannot just randomly generate six numbers. The five white numbers must be unique and
between 1 and 49. ( After a ball is removed from the ontainer, it can't be selected again.) The
one red number must be between 1 and 42. Note that the red number can possibly be the same
number as one of the selected white balls.*/
import java.util.Random;
public class powerBall
{
	public static void main (String args[]) 
	{   
      Random rand = new Random();
      int n1 = rand.nextInt(49)+1;
      int n2 = rand.nextInt(49)+1;
      int n3 = rand.nextInt(49)+1;
      int n4 = rand.nextInt(49)+1;
      int n5 = rand.nextInt(49)+1;
      int n6 = rand.nextInt(42)+1;
      while (n2 == n1)
      {
         n2 = rand.nextInt(48)+1;
      }
      while ((n3 == n1)||(n3 ==n2))
      {
         n3 = rand.nextInt(48)+1;
      }
      while ((n4 == n1)||(n4 ==n2)||(n4 ==n3))
      {
         n4 = rand.nextInt(48)+1;
      }
      while ((n5 == n1)||(n5 ==n2)||(n5 ==n3)||(n5 ==n4))
      {
         n5 = rand.nextInt(48)+1;
      }
      System.out.print(n1+ " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}
}