/*  Write a program that take the radius of a cylinder (a double) and the height (a double) as input
and outputs the cylinder's diameter, surface area, circumference, and volume
*/
    
import java.util.Scanner;

public class JavaCylinder
{
	public static void main (String args[]) 							
	{  
      final double pi = 3.14159265359;
      System.out.println("Please enter the radius of the cylinder:");
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      System.out.println("Please enter the height of the cylinder:");
      double h = input.nextDouble();
      System.out.println("The cylinder's diameter is " + 2*r);
      System.out.println("The cylinder's surface area is " + (2*pi*r*r + 2*pi*r*h));
      System.out.println("The cylinder's circumference is " + 2*pi*r);
      System.out.print("The cylinder's volume is " + pi*r*r*h);
	}
}