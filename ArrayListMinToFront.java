import java.util.ArrayList;
public class ArrayListMinToFront
{
	public static void main (String args[])
	{
	   ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(3);
      list.add(8);
      list.add(92);
      list.add(4);
      list.add(2);
      list.add(17);
      list.add(9);
      System.out.println(list);
      int min = list.get(0);
      for (int i=0; i<list.size(); i++)
      {
         if (list.get(i)<min)
         {
            min = list.get(i);
         }         
      }
      list.remove(list.indexOf(min));
      list.add(0,min);
      System.out.println(list);
	}		
}