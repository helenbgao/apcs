// Given an array, swap the first and last numbers in the array.
// {3,4,5,6,7,8,9}

public class swapEnds
{
	public static void main(String args[])
	{
      int list[] = {3,4,5,6,7,8,9};
      int last = list[list.length-1];
      list[list.length-1] = list[0];
      list[0] = last;
      for (int i=0; i<list.length; i++)
      {
         System.out.print(list[i] + " ");
      }
   }   
 }
 