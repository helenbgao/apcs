


import java.awt.*;
import java.applet.*;


public class Java0407 extends Applet
{
	public void paint(Graphics g)
	{
      g.setColor(Color.cyan);
      g.fillRect(0,0,1000,500);
      g.setColor(Color.blue);
      g.fillRect(0,500,1000,250);
      g.setColor(Color.yellow);
      g.fillArc(-100,-100,200,200,270,90);
      Color white = new Color(255,255,255);
      g.setColor(white);
      g.fillOval(400,200,100,100);
      g.fillOval(377,290,150,100);
      g.fillOval(355,380,200,150);
      g.setColor(Color.black);
      g.fillRect(413,125,75,75);
      g.fillRect(400,200,100,5);
      g.fillOval(430,225,10,10);
      g.fillOval(460,225,10,10);
      g.drawArc(425,250,50,25,180,180);
      g.drawLine(350,280,400,330);
      g.drawLine(500,330,560,330);
	}
}
