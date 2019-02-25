// 	Prog04.java
//
// 	Bank Class 2   
//
//	WEIGHT: 4
//
/////////////////////////////////////////////////////////////////////////
//
//  Write a parameter constructor for the <Bank> class, which initializes
//	checking and savings to specified values.  Additionally, write the 
//	getChecking, getSavings, alterChecking and alterSavings methods.
//
//  REQUIRED OUTPUT DISPLAY:
//
//	Tom's checking balance: 3000.0
// 	Tom's savings balance:  2000.0
//	Sue's checking balance: 4500.0
// 	Sue's savings balance:  1500.0
//
//	Tom's checking balance: 2000.0
// 	Tom's savings balance:  1500.0
//	Sue's checking balance: 6500.0
// 	Sue's savings balance:  3000.0

//
/////////////////////////////////////////////////////////////////////////


public class Prog04
{
	public static void main(String args[])
	{
		Bank tom = new Bank(3000.0,2000.0);
		Bank sue = new Bank(4500.0,1500.0);
		System.out.println("Tom's checking balance:	" + tom.getChecking());
		System.out.println("Tom's savings balance:	" + tom.getSavings());
		System.out.println("Sue's checking balance:	" + sue.getChecking());
		System.out.println("Sue's savings balance:	" + sue.getSavings());
		System.out.println();
		tom.alterChecking(-1000.0);
		tom.alterSavings(-500.0);
		sue.alterChecking(2000.0);
		sue.alterSavings(1500.0);
		System.out.println("Tom's checking balance:	" + tom.getChecking());
		System.out.println("Tom's savings balance:	" + tom.getSavings());
		System.out.println("Sue's checking balance:	" + sue.getChecking());
		System.out.println("Sue's savings balance:	" + sue.getSavings());
	}
}


class Bank
{
	private double checking;
	private double savings;
	



}

		
	