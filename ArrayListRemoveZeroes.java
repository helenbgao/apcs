import java.util.ArrayList;
public class ArrayListRemoveZeroes
{
	public static void main (String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(0);
      list.add(7);
      list.add(2);
      list.add(0);
      list.add(0);
      list.add(4);
      list.add(0);
      System.out.println(list);
      for (int i=(list.size()-1); i>=0; i--)
      {  
         if (list.get(i)==0)
         {
            list.remove(i);
         }
      }
      System.out.println(list);
	}		
}