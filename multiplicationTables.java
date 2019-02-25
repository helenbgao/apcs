
public class multiplicationTables
{
	public static void main (String args[]) 
	{   	
      int a = 1;
      for (int i=0; i<5; i++)
      {
         for (int j=1; j<=10; j++)
         {
            System.out.print(a*j + " ");
         }
         System.out.println();
         a++;
      }
 
	}
}