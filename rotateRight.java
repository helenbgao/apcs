public class rotateRight
{
	public static void main(String args[])
	{
      int list[] = {5,6,9,3,11};
      rotateRight(list);
   }
   
   public static void rotateRight(int[] list)
   {
      int temp = list[list.length-1];
      for (int i=list.length-1; i>0; i--)
      {
         list[i] = list[i-1];
      }
      list[0] = temp;
      
      for (int j=0; j<list.length; j++)
      {
         System.out.print(list[j] + " ");
      }
   }
 }