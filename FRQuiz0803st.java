import java.util.Scanner;
import java.util.Random;
public class FRQuiz0803st
{
	public static void main (String args[])
	{
      Scanner input = new Scanner(System.in);
      System.out.println("Please input a minimum.");
      int min = input.nextInt();
      System.out.println("Please input a maximum.");
      int max = input.nextInt();
      System.out.println("A random number between " + min + " and " + max + " is " + getRandom(min,max) + ".");
	}
	//	precondition:	min is the value of the smallest possible random integer.
   //				      max is the value of the largest possible random integer.
   //	postcondition:	getRandom returns an integer x, such that min <= x <= max.
public static int getRandom (int min, int max)
{
   Random rand = new Random();
   int num = rand.nextInt((max-min)+1) + min;
   return num;
}
}