// MathLab0404st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the MathLab04 assignment.



import java.text.DecimalFormat;
import java.util.Scanner;


 
public class MathLab04st
{
	public static void main(String args[]) 
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the primes upper bound: ");
		final int MAX = input.nextInt();
		boolean primes[];
		primes = new boolean[MAX];
		//computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
      
   
      for (int i=2; i<primes.length; i++)
      {
         if (primes[i] == false)
         {
            for (int j = 2*i; j<primes.length; j+=i)
            {
               primes[j] = true;
            }
         }
      }
      
      for (int i2=2; i2<primes.length; i2++)
      {
         if (primes[i2] == false)
         {
            System.out.print(i2 + " ");
         }
      }
      
				  
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		DecimalFormat d = new DecimalFormat("0000");		
      for (int i=2; i<primes.length; i++)
      {
         if (primes[i] == false)
         {
            for (int j = 2*i; j<primes.length; j+=i)
            {
               primes[j] = true;
            }
         }
      }
      
      for (int i2=2; i2<primes.length; i2++)
      {
         if (primes[i2] == false)
         {
            System.out.print(d.format(i2) + " ");
         }
      }
	}
	
}



