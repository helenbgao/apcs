

/*
        String soda = "coke";
        String pop = "pepsi";
        String coke = "pop";
        String pepsi = "soda";
        String can = "bottle";
        String bottle = "can";
        
   Using the above variables print out the following lines:
   say pepsi not soda or coke
   say coke not pop or pepsi
   say soda not coke or pop
   say pop not pepsi or bottle
   say bottle not pop or can
   say can not bottle or soda
   
   Create 3 new String variables  and generate (3)unique sentences
    using the variables which you just created.

*/
public class ParameterMystery
{
	public static void main (String args[])
	{
      String pepsi = "coke";
      String coke = "pepsi";
      String bottle = "can";
      String can = "bottle";
      String pop = "soda";
      String soda = "pop";
      
      System.out.println("say " + coke + " not " + pop + " or " + pepsi);
      System.out.println("say " + pepsi + " not " + soda + " or " + coke);
      System.out.println("say " + pop + " not " + pepsi + " or " + soda);
      System.out.println("say " + soda + " not " + coke + " or " + can);
      System.out.println("say " + can + " not " + soda + " or " + bottle);
      System.out.println("say " + bottle + " not " + can + " or " + pop);
      System.out.println();
      
      String idol = "nine";
      String producer = "percent";
      String time = "debut";
      
      System.out.println("when will " + idol + " " + producer + " " + time);
      System.out.println("@iqiyi please let " + idol + " " + producer + " " + time);
      System.out.print(idol + " " + producer + " should " + time + " soon");	
   }
}