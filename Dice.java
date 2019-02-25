import java.util.Random;
public class Dice
{
	public static void main(String args[])
	{
      Random rand = new Random();
      double sum = 0.0;
      int one = 0;
      int two = 0;
      int three = 0;
      int four = 0;
      int five = 0;
      int six = 0;
      int list[] = new int[100000];
      for (int i=0; i<list.length; i++)
      {
         list[i] = rand.nextInt(6)+1;
         System.out.print(list[i] + " ");
         sum+=list[i];
         if (list[i] == 1)
         {
            one++;
         }
         else if (list[i] == 2)
         {
            two++;
         }
         else if (list[i] == 3)
         {
            three++;
         }
         else if (list[i] == 4)
         {
            four++;
         }
         else if (list[i] == 5)
         {
            five++;
         }
         else
         {
            six++;
         }
      }
      System.out.println();
      System.out.println("There are " + one + " 1s.");
      System.out.println("There are " + two + " 2s.");
      System.out.println("There are " + three + " 3s.");
      System.out.println("There are " + four + " 4s.");
      System.out.println("There are " + five + " 5s.");
      System.out.println("There are " + six + " 6s.");
      System.out.print("The average is " + sum/list.length);
   } 
 }