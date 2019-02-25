public class FRQuiz0903
{
	public static void main(String args[])
	{
		Car car = new Car("Ford",2009,"Stick",300);
      car.getData();
	}
}


class Engine
{
	private int horsePower;   
	public Engine(int hp)
	{
		horsePower = hp;
	}
}

class Transmission
{
	private String type;
	
	public Transmission(String t)
	{
		type = t;
	}
}

class Car
{
	private String make;
	private int year;
	Engine engine;
	Transmission transmission;
		
	public Car(String m, int y, String t, int hp)
	{
      make = m;
      year = y;
      engine = new Engine(hp);
      transmission = new Transmission(t);
	}
   
   public void getData()
   {
      System.out.println("Car make: " + make);
      System.out.println("Year: " + year);
      System.out.println("Transmission: " + transmission);
      System.out.println("Engine: " + engine);
   }
}

      