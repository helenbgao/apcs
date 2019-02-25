
//  Write an application that creates and prints (25) random phone number of the form
//   XXX-XX-XXXX.  Include the dashes in the output.  Do not let the first (3) digits
//  contain a 8 or 9; make sure that the second set of numbers  is not greater than 742.
import java.util.Random;
public class phoneNumberStu
{
	public static void main (String args[])
	{  
      Random rand = new Random();
      for (int i=0; i<25; i++)
         {
            int num1 = rand.nextInt(700)+100;
            int num2 = num1%100;
            while (num2 > 79)
               {
                  num1 = rand.nextInt(800);
                  num2 = num1%100;
                  int num3 = num2%10;
                  while (num3 > 7)
                     {
                        num1 = rand.nextInt(800);
                        num2 = num1%100;
                        num3 = num2%10;
                     }
               }
            int pt2 = rand.nextInt(642)+100;
            int pt3 = rand.nextInt(8999)+1000;
            System.out.println(num1 + "-" + pt2 + "-" + pt3);
         }
             
	}
}