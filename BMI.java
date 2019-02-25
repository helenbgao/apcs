import java.util.Scanner;

public class BMI
{
	public static void main (String args[]) 							
	{  
 	   Scanner input = new Scanner(System.in);
      System.out.println("What is your weight in pounds?");
      int weight = input.nextInt();
      System.out.println("What is your height in inches?");
      int height = input.nextInt();
      double bmi = (weight*703)/(height*height);
      System.out.println("You weigh " + weight + " pounds.");
      System.out.println("You are " + height + " inches tall.");
      System.out.println("Your BMI is " + bmi + ".");
      if (bmi < 18.5)
         {
            System.out.print("You are underweight.");
         }
      else if ((bmi >= 18.5) && (bmi <= 25))
         {
            System.out.print("Your weight is normal.");
         }
      else if ((bmi > 25) && (bmi < 30))
         {
            System.out.print("You are overweight.");
         }
      else 
         {
            System.out.print("You are obese.");
         }
	}
}