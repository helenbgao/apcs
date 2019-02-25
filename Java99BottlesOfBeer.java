import java.util.Scanner;

public class Java99BottlesOfBeer
{
	public static void main (String args[])
	{
      Scanner input = new Scanner(System.in);
      System.out.println("What is the starting number?");
      int n = input.nextInt();
      if ((n >=2) && (n <= 150))
         {
            for (int i = n; i > 0; i--)
      		   {
                  System.out.println(i + " bottles of beer on the wall, " + i + " bottles of	beer.");
                  System.out.println("Take one down, pass it around, " + (i-1) + " bottles of	beer on the wall.");
                  
                  if (i%7 == 0)
                     {
                        System.out.println(i + " is evenly divisible by 7.");
                     }
               }
         }
	}
}