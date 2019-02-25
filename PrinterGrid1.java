import java.util.Scanner;
public class PrinterGrid1
{
	public static void main (String args[])
	{		
      Scanner input = new Scanner(System.in);
      System.out.println("How many rows would you like?");
      int r = input.nextInt();
      System.out.println("How many columns would you like?");
      int c = input.nextInt();
      printGrid(r, c);
	}
   
   public static void printGrid(int row, int column)
   {
      for (int i=0; i<row; i++)
      {
         for (int j=1; j<row*column; j+=row)
         {
            System.out.print(i+j + " ");
         }
         System.out.println();
      }
   }
}
