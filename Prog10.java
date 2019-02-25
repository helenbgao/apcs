// APCS1 Lab Test 1
//
// Prog10.java
//
// Math Methods
//
// Points: 4
//
////////////////////////////////////////////////////////////////////////////////
// Complete this program so that it will demonstrate a variety of Math methods.
// When finished, the output will look like this:
//
// The square root of 64 is 8.0
// The absolute value of 7 is 7
// The absolute value of -7 is 7
// 3 to the 5th power is 243.0
// 5 to the 3rd power is 125.0
// 69.999 rounded down is 69.0
// 69.001 rounded up is 70.0
// 69.499 rounded to the nearest integer is 69
// 69.5 rouded to the nearest integer is 70
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: The first line is done for you.
//
// Remember: No hard-coding of the answers!



public class Prog10
{
	public static void main (String args[])
	{
		System.out.println("The square root of 64 is " + Math.sqrt(64));
      System.out.println("The absolute value of 7 is " + Math.abs(7));
      System.out.println("The absolute value of -7 is " + Math.abs(-7));
      System.out.println("3 to the 5th power is " + Math.pow(3,5));
      System.out.println("5 to the 3rd power is " + Math.pow(5,3));
      System.out.println("69.999 rounded down is " + Math.floor(69.999));
      System.out.println("69.001 rounded up is " + Math.ceil(69.001));
      System.out.println("69.499 rounded to the nearest integer is " + Math.round(69.499));
      System.out.print("69.5 rounded to the nearest integer is " + Math.round(69.5));
	}
}



