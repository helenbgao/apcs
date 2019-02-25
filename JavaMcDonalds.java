
import java.util.Scanner;

public class JavaMcDonalds
{
	public static void main (String args[]) 							
	{  
      Scanner input = new Scanner(System.in);
      System.out.println("How many Big Macs have you eaten?");
      int hamburgers = input.nextInt();
      System.out.println("How many miles have you walked?");
      double miles = input.nextDouble();
      System.out.println("You have eaten " + hamburgers + " Big Macs and walked " + miles + " miles.");
      int eaten = hamburgers*590;
      double burned = 93.5*miles;
      System.out.print("You have consumed " + eaten + " calories and need to walk " + (eaten-burned)/93.5 + " more miles."); 
	}
}