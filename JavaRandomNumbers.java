import java.util.Random;
import java.util.Scanner;
public class JavaRandomNumbers
{
	public static void main (String args[])
	{
		Random rand = new Random();
      Scanner input = new Scanner(System.in);
      System.out.println("How many numbers would you like to generate?");
      int total = input.nextInt();
      System.out.println("What are the low and high values of the range?");
      int low = input.nextInt();
      int high = input.nextInt();
      int num;
      double sum = 0;
      for (int i=0; i<total; i++)
         {
            num = rand.nextInt((high-low)+1) + low;
            while (num % 2 == 0)
               {
                  num = rand.nextInt((high-low)+1) + low;
               }
            sum += num;
            System.out.print(num + " ");
         }
      System.out.println();
      double average = sum/total;
      System.out.println("The sum of these numbers is " + sum);
      System.out.println("The average of these numbers is " + average);
	}
}

