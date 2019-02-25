// APCS1 Lab Test 1
//
// Prog09.java
//
// PAC-MAN
//
// Points: 4
//
//
////////////////////////////////////////////////////////////////////////////////
// Right now this program draws a black screen with 2 blue lines representing
// part of PAC-MAN's maze.
//
////////////////////////////////////////////////////////////////////////////////
// Complete this program so that it will display the classic arcade icon of PAC-MAN.
// Pacman must be a yellow 3/4 circle with his mouth open to the right.
// Pacman must have a diameter of 300 pixels and be perfect centered on the 
// applet window. You will also need to draw 3 round "snacks" for PAC-MAN.
// PAC-MAN's snacks are solid circles with a diameter of 80 pixels.
// This 3 circles must be spaced evenly apart and be perfectly centered vertically.
//
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: You will need to load Prog09.html in order to execute this file.
//
// ALSO: The sample exection of this file is on the back of your lab test sheet.
//




import java.awt.*;
import java.applet.*;


public class Prog09 extends Applet
{
	public void paint(Graphics g)
	{
		// draw maze
		g.setColor(Color.black);
		g.fillRect(0,0,800,600);
		g.setColor(Color.cyan);
		g.fillRect(0,80,800,20);
		g.fillRect(0,500,800,20);
		
		// draw 3 snacks
      g.setColor(Color.white);
      g.fillOval(500,260,80,80);
      g.fillOval(600,260,80,80);
      g.fillOval(700,260,80,80);	
		
		// draw PAC-MAN
	   g.setColor(Color.yellow);
      g.fillArc(250,150,300,300,45,270);
	
	}
}

