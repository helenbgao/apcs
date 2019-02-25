


import java.awt.*;
import java.applet.*;


public class JavaParallelLines extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(100,100,500,100);
      g.drawLine(100,100,125,75);
      g.drawLine(100,100,125,125);
      g.drawLine(500,100,475,75);
      g.drawLine(500,100,475,125);
      Color purple = new Color(153,50,204);
      g.setColor(purple);
      g.drawLine(100,200,500,200);
      g.drawLine(100,200,75,175);
      g.drawLine(100,200,75,225);
      g.drawLine(500,200,525,175);
      g.drawLine(500,200,525,225);

	}
}
