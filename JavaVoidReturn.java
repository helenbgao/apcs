import java.util.Scanner;
public class JavaVoidReturn
{  
	public static void main(String args[])
	{
	   Scanner input = new Scanner(System.in);
      System.out.println("What is your height in inches?");
      int height = input.nextInt();
      System.out.println("What is your weight in pounds?");
      int weight = input.nextInt();
      System.out.println("What is your age?");
      int age = input.nextInt();
      System.out.println("What is the current temperature in Fahrenheit?");
      int temp = input.nextInt();
      
      System.out.println("Your height in inches is " + height + " which converts to " + height(height) + " centimeters.");
      System.out.println("Your weight in pounds is " + weight + " which converts to " + weight(weight) + " kilograms.");
      System.out.println("Your age in human years is " + age + " which converts to " + age(age) + " dog years.");
      System.out.println("The temperature in Fahrenheit is " + temp + " which converts to " + temperature(temp) + " degrees Celsius.");

//       height(height);
//       weight(weight);
//       age(age);
//       temperature(temp);
	}  
   
      public static double height(int h)
      {
         double cm = h*2.54;
         return cm;
      }
      
      public static double weight(int w)
      {
         double kg = w/2.2;
         return kg;
      }
      
      public static int age(int a)
      {
         int dog = a*7;
         return dog;
      }
      
      public static double temperature(int t)
      {
         double c = (t-32)*5/9;
         return c;
      }
//    public static void height(int h)
//    {
//       double cm = h*2.54;
//       System.out.println("Your height in inches is " + h + " which converts to " + cm + " centimeters.");
//    }
//    
//    public static void weight(int w)
//    {
//       double kg = w/2.2;
//       System.out.println("Your weight in pounds is " + w + " which converts to " + kg + " kilograms.");
//    }
//    
//    public static void age(int a)
//    {
//       int dog = a*7;
//       System.out.println("Your age in human years is " + a + " which converts to " + dog + " dog years.");
//    }
//    
//    public static void temperature(int t)
//    {
//       double c = (t-32)*5/9;
//       System.out.println("The temperature in Fahrenheit is " + t + " which converts to " + c + " degrees Celsius.");
//    }   
}
