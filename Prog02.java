// 	Prog02.java
//
// 	GCF and LCM   
//
//	WEIGHT: 4
//
/////////////////////////////////////////////////////////////////////////
//
//  Complete the program below that computes and displays the Greatest
//	Common Factor (GCF) and the Least Common Multiple (LCM) of two 
//	integers entered at the keyboard.
//
//  REQUIRED OUTPUT DISPLAY:
//
//  Enter number 1  -->  108
//  Enter number 2  -->  120
//
//	The GCF of 120 and 108 is 12
//	The LCM of 120 and 108 is 1080
//
//  Enter number 1  -->  111
//  Enter number 2  -->  74
//
//	The GCF of 111 and 74 is 37
//	The LCM of 111 and 74 is 222
//
//
/////////////////////////////////////////////////////////////////////////


import java.util.*;

public class Prog02
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number 1  -->  ");
		int num1 = keyboard.nextInt();
		System.out.print("Enter number 2  -->  ");
		int num2 = keyboard.nextInt();
		int temp1 = num1;
		int temp2 = num2;
		int gcf = 1;
		int lcm = 1;
		int rem = 0;
		do
		{
		
		
		
			
		}
		while (rem != 0);


		System.out.println("The GCF of " + num1 + " and " + num2 + " is " + gcf);
		System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
	}
}

		
	