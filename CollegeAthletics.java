public class CollegeAthletics
{
	public static void main(String args[])
	{
      Basketball basketball = new Basketball();
      basketball.height();
      basketball.jersey();
      System.out.println("Minimum GPA: " + basketball.gpa());
      System.out.println("High school graduation: " + basketball.graduated());
      System.out.println("Minimum SAT: " + basketball.sat());
      System.out.println("Core class completion: " + basketball.classes());
      System.out.println();
      
      Football football = new Football();
      football.weight();
      football.dash();
      System.out.println("Minimum GPA: " + football.gpa());
      System.out.println("High school graduation: " + football.graduated());
      System.out.println("Minimum SAT: " + football.sat());
      System.out.println("Core class completion: " + football.classes());
      System.out.println();
      
      Soccer soccer = new Soccer();
      soccer.hometown();
      soccer.position();
      System.out.println("Minimum GPA: " + soccer.gpa());
      System.out.println("High school graduation: " + soccer.graduated());
      System.out.println("Minimum SAT: " + soccer.sat());
      System.out.println("Core class completion: " + soccer.classes());
      System.out.println();
      
      Baseball baseball = new Baseball();
      baseball.batting();
      baseball.homeruns();
      System.out.println("Minimum GPA: " + baseball.gpa());
      System.out.println("High school graduation: " + baseball.graduated());
      System.out.println("Minimum SAT: " + baseball.sat());
      System.out.println("Core class completion: " + baseball.classes());
	}
}

class AthletesMinimumRequirements
{
   public double gpa()
   {
      return 2.0;
   }
   
   public boolean graduated()
   {
      return true;
   } 

   public int sat()
   {  
      return 820;
   }
   
   public boolean classes()
   {
      return true;
   }
}

class Basketball extends AthletesMinimumRequirements
{
   public void height()
   {
      System.out.println("Height: at least 6 ft");
   }
   
   public void jersey()
   {
      System.out.println("Jersey numbers: 00 to 99");
   }
}

class Football extends AthletesMinimumRequirements
{
   public void weight()
   {
      System.out.println("Weight: at least 200 lbs");
   }
   
   public void dash()
   {
      System.out.println("40 yd dash speed: less than 5 seconds");
   }
}

class Soccer extends AthletesMinimumRequirements
{
   public void hometown()
   {
      System.out.println("Hometown: Spokane");
   }
   
   public void position()
   {
      System.out.println("Position: forward");
   }
   
   public int sat()
   {
      return 900;
   }
}

class Baseball extends AthletesMinimumRequirements
{
   public void batting()
   {
      System.out.println("Batting average: .300");
   }
   
   public void homeruns()
   {
      System.out.println("Homeruns: 50");
   }

   public double gpa()
   {
      return 2.5;
   }
}
