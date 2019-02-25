/*Your cell phone rings. Return true if you should answer it.  Normally
 you answer, except
in the morning you only answer if it is your mom calling.  In all cases,
 if you sleep, you do not answer.

answerCell (false, false, false)  = true
answerCell (false, false, true)  =  true
answerCell (true, false, false) = true

a is in the morning
b is mom calling
c is asleep

*/
public class cellPhone
{
  
	public static void main(String args[])
	{
      System.out.println(answerCell(false, false, false));
	}
	public static boolean answerCell(boolean a, boolean b, boolean c)
   {
      boolean answer;
      if (c==true)
      {
         answer = false;
      }
      else if ((a==true) && (b==false))
      {
         answer = false;
      }
      else
      {
         answer = true;
      }
      return answer;
   }

   
   

	
   
}
