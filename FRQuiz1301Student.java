import java.util.ArrayList;
public class FRQuiz1301Student
{
	public static void main (String args[])
	{
      ArrayList<String> list = new ArrayList<String>();
      list.add("Monday");
      list.add("Tuesday");
      list.add("Wednesday");
      list.add("Thursday");
      list.add("Friday");
      System.out.println(list);   
      String temp = list.get(0);
      list.set(0,list.get(list.size()-1));
      list.set(list.size()-1,temp);
      System.out.println(list);
   }

}