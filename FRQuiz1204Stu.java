public class FRQuiz1204Stu
{
	public static void main (String args[])
	{
      long fibo[] = new long[50];
      fibo[0] = 0;
      fibo[1] = 1;
      System.out.print(fibo[0] + " " + fibo[1]);
      for (int i=2; i<fibo.length; i++)
      {
         fibo[i] = fibo[i-1]+fibo[i-2];
         System.out.print(fibo[i]+ " ");
      }
   }		
}