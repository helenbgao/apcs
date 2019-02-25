// 	Prog03.java
//
// 	Bank Class 1   
//
//	WEIGHT: 2
//
/////////////////////////////////////////////////////////////////////////
//
//  Write a DEFAULT-constructor for the <Bank> class, which initializes
//	checking and savings to 0.  Additionally, write the getChecking
//	and getSavings methods.
//
//  REQUIRED OUTPUT DISPLAY:
//
//	Tom's checking balance: 0.0
// 	Tom's savings balance:  0.0
//	Sue's checking balance: 0.0
// 	Sue's savings balance:  0.0
//
//
/////////////////////////////////////////////////////////////////////////


public class Prog03
{
	public static void main(String args[])
	{
		Bank tom = new Bank();
		Bank sue = new Bank();
		System.out.println("Tom's checking balance:	" + tom.getChecking());
		System.out.println("Tom's savings balance:	" + tom.getSavings());
		System.out.println("Sue's checking balance:	" + sue.getChecking());
		System.out.println("Sue's savings balance:	" + sue.getSavings());
		System.out.println();
	}
}


class Bank
{
	private double checking;
	private double savings;
   
   public Bank()
   {
      checking = 0.0;
      savings = 0.0;
   }
   
   public double getChecking()
   {
      return checking;
   }
	
   public double getSavings()
   {
      return savings;
   }	
}	