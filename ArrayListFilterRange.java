import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListFilterRange
{
	public static void main (String args[])
	{
      Scanner input = new Scanner(System.in);
      System.out.println("What is the minimum value you would like to filter out?");
      int min = input.nextInt();
      System.out.println("What is the maximum value you would like to filter out?");
      int max = input.nextInt();
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(4);
      list.add(7);
      list.add(9);
      list.add(2);
      list.add(7);
      list.add(7);
      list.add(5);
      list.add(3);
      list.add(5);
      list.add(1);
      list.add(7);
      list.add(8);
      list.add(6);
      list.add(7);
      System.out.print(filterRange(list,min,max));
      
	}		
   public static ArrayList filterRange(ArrayList<Integer> list, int min, int max)
   {  
      ArrayList<Integer> l = list;
      for (int i=l.size()-1; i>=0; i--)
      {
         if ((list.get(i)<=max) && (list.get(i)>=min))
         {
            list.remove(i);
         }
      }
      return l;
   }
}