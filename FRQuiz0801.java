public class FRQuiz0801
{
	public static void main (String args[])
	{
		displayMax(12,23,34);
		displayMax(12,34,23);
		displayMax(34,23,12);
	}
	
	public static void displayMax (int n1, int n2, int n3)
	//	postcondition:	displayMax displays the value of the largest parameter.	
	{
	   int max = n1;
      if (n2>n1)
      {
         max = n2;
         if (n3>n2)
         {
            max = n3;
         }
      }
      else if (n3>n1)
      {  
         max = n3;
      }
      System.out.println(max);
	}
}

