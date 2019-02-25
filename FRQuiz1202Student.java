public class FRQuiz1202Student
{
	public static void main (String args[])
	{
		int[] numbers = {11,22,33,44,55,66,77,88,99};
		int n = numbers.length;
      int total = 0;
      for (int i=0; i<n; i++)
      {
         total += numbers[i];
      }
      double average = total/n;
      System.out.print(average);
	}

}


