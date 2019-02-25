import java.util.Scanner;
public class distCalculation
{
	public static void main(String args[])
	{
      Scanner input = new Scanner(System.in);
      System.out.println("What is the x-coordinate of the first point?");
      double x1 = input.nextDouble();    
      System.out.println("What is the y-coordinate of the first point?");
      double y1 = input.nextDouble();    
      System.out.println("What is the x-coordinate of the second point?");
      double x2 = input.nextDouble();    
      System.out.println("What is the y-coordinate of the second point?");
      double y2 = input.nextDouble();  
      System.out.print("The distance between the two points is " + Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)))); 
	}
	

}