import java.util.ArrayList;
public class ArrayListLab9
{
	public static void main (String args[])
	{
		ArrayList letters = new ArrayList();
      letters.add("f");
      letters.add(1,"i");
      letters.add("e");
      letters.add(1,"r");
      letters.add(4,"z");
      System.out.println(letters);
      letters.remove("i");
      int index = letters.indexOf("e");
      letters.remove(index);
      letters.add("o");
      System.out.println(letters);
	}		
}