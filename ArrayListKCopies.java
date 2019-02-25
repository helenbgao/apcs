
import java.util.*;
public class ArrayListKCopies
{
	public static void main (String args[])
	{
	   ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(4);
      list.add(1);
      list.add(2);
      list.add(0);
      list.add(3);
      scalebyK(list);
	}		
   
   public static void scalebyK(ArrayList<Integer> list)
   {
      for (int i=0; i<list.size(); i++)
      {
         if (list.get(i)!=0)
         {
            int k = list.get(i);
            for (int j=0; j<k; j++)
            {
               System.out.print(k + " ");
            }
         }
      }
   }
}