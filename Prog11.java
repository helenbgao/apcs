// APCS1 Lab Test 2
//
// Prog11.java
//
// 5 Function Calculator
//
// Points: 4
//
////////////////////////////////////////////////////////////////////////////////
// Create the Calculator class that will allow this program to compile and execute.  
//
////////////////////////////////////////////////////////////////////////////////
// When complete, the output should look like this:
//
// 1000 + 2000 = 3000
// 5000 - 1037 = 3976
// 1024 * 1024 = 1048576
// 5000 / 1024 = 4
// 5000 % 1024 = 904


public class Prog11
{
	public static void main (String args[])
	{
		System.out.println("1000 + 2000 = " + Calculator.add(1000,2000));
		System.out.println("5000 - 1024 = " + Calculator.subtract(5000,1024));
		System.out.println("1024 * 1024 = " + Calculator.multiply(1024,1024));
		System.out.println("5000 / 1024 = " + Calculator.divide(5000,1024));
		System.out.println("5000 % 1024 = " + Calculator.remainder(5000,1024));
	}
}

class Calculator
{
   public static int add(int a, int b)
   {
      return a+b;
   }
   
   public static int subtract(int a, int b)
   {
      return a-b;
   }

   public static int multiply(int a, int b)
   {
      return a*b;
   }

   public static int divide(int a, int b)
   {
      return a/b;
   }

   public static int remainder(int a, int b)
   {
      return a%b;
   }
}
