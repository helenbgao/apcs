
/*  Return true if the given array contains an unlucky 1 in either the first 2 or 
 last 2 positions in the array. 

unlucky1({1, 3, 4, 5, 7, 14}) = true
unlucky1({2, 6, 1, 3, 4, 5}) = false
unlucky1({1, 1, 1}) = false

*/
public class unlucky1Student
{
	public static void main(String args[])
	{
      int nums[]= {1, 3, 4, 5, 7, 14};  
      System.out.print(unlucky1(nums));
   }
      
   public static boolean unlucky1(int list[])
   {
      if ((list[0] == 1 || list[1] == 1) && (list[list.length-1] == 1 || list[list.length-2] == 1))
      {
         return false;
      }
      else if (list[0] == 1 || list[1] == 1 || list[list.length-1] == 1 || list[list.length-2] == 1)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
 }