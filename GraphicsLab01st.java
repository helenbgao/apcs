// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01st extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
	   g.drawRect(100,100,250,250);
      g.drawRect(200,200,250,250);
      g.drawLine(100,100,200,200);
      g.drawLine(350,100,450,200);
      g.drawLine(100,350,200,450);
      g.drawLine(350,350,450,450);
		
		// DRAW SPHERE
		g.drawOval(900,100,50,200);
      g.drawOval(875,100,100,200);
      g.drawOval(850,100,150,200);
      g.drawOval(825,100,200,200);
      
      g.drawOval(825,175,200,50);
      g.drawOval(825,150,200,100);
      g.drawOval(825,125,200,150);
      g.drawOval(825,100,200,200);
		
		// DRAW TRIANGLE	
      g.drawLine(600,350,350,600);  
      g.drawLine(600,350,850,600);   
      g.drawLine(350,600,850,600); 	
      g.drawLine(600,350,600,600);
      g.drawLine(350,600,725,475);
      g.drawLine(850,600,475,475);
	}

}


