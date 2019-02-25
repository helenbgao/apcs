import java.util.ArrayList;
public class ArrayListStrings
{
	public static void main (String args[])
	{
		ArrayList<String> list = new ArrayList<String>();	
      list.add("It");
      list.add("was");
      list.add("a");
      list.add("stormy");
      list.add("night");
      System.out.println(list);
      System.out.println("The size of this array list is " + list.size());
      list.add(3,"dark");
      list.add(4,"and");
      System.out.println(list);
      list.set(1,"IS");
      System.out.println(list);
	}		
}