public class FRQuiz0902
{
	public static void main (String args[])
	{
		Pidget p = new Pidget(10,20);
		System.out.println(p.getWidgets());
		System.out.println(p.getPidgets());
	}
}


class Widget
{
	private int numWidgets;
	
	public Widget(int nw)
	{
      numWidgets = nw;
	}
	
	public int getWidgets()	
	{
		return numWidgets;
	}
}


class Pidget extends Widget
{
	private int numPidgets;
	
	public Pidget(int nw, int np)
	{
      super(nw);
		numPidgets = np;
	}
	
	public int getPidgets()
	{
		return numPidgets;
	}	
}