import java.util.Scanner;

public class JavaSphere
{
	public static void main (String args[]) 							
	{  
      Scanner input = new Scanner(System.in);
 		System.out.println("Sphere");
      System.out.println("Enter the radius of the sphere");
      
      final double pi = 3.141519;
      
      double rad = (double)input.nextInt();
      double dia = (double)rad*2;
      double cir = (double)rad*2*pi;
      double sur = (double)4*pi*rad*rad;
      double vol = (double)4/3*pi*rad*rad*rad;
      
      System.out.println("the radius of the sphere is: " + rad);
      System.out.println("the diameter of the sphere is: " + dia);
      System.out.println("the circumference area of the sphere is: " + cir);
      System.out.println("the surface area of the sphere is: " + sur);
      System.out.println("the volume of the sphere is: " + vol);

	}
}