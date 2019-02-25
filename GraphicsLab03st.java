// GraphicsLab03st.java
// Student Version
import java.util.Random;
import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);		
		
		// Draw Random Lines
      Random rand = new Random();
      for (int i=0; i<100; i++)
         {
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
      	   g.setColor(new Color(red,green,blue));
            int x1 = rand.nextInt(385)+10;
            int x2 = rand.nextInt(385)+10;
            int y1 = rand.nextInt(290)+10;
            int y2 = rand.nextInt(290)+10;
            g.drawLine(x1,y1,x2,y2);
         }
						
		// Draw Random Squares
      for (int i=0; i<100; i++)
         {
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
      	   g.setColor(new Color(red,green,blue));
            int x = rand.nextInt(335)+395;
            int y = rand.nextInt(240)+10;
            g.fillRect(x,y,50,50);
         }
		
		// Draw Random Circles
      for (int i=0; i<100; i++)
         {
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
      	   g.setColor(new Color(red,green,blue));
            int d = rand.nextInt(200);
            int x = rand.nextInt(385-d)+10;
            int y = rand.nextInt(290-d)+300;
            g.drawOval(x,y,d,d);
         }
		
		// Draw 3-D Box
	   g.setColor(Color.red);
      g.fillRect(600,400,100,100);
      g.setColor(Color.green);
      Polygon rhombus = new Polygon();
      rhombus.addPoint(600,400);
      rhombus.addPoint(550,350);
      rhombus.addPoint(550,450);
      rhombus.addPoint(600,500);
      g.fillPolygon(rhombus);
      g.setColor(Color.yellow);
      Polygon trapezoid = new Polygon();	
      trapezoid.addPoint(550,350);
      trapezoid.addPoint(650,350);
      trapezoid.addPoint(650,400);
      trapezoid.addPoint(600,400);
      g.fillPolygon(trapezoid);
      g.setColor(Color.blue);
      Polygon triangle = new Polygon();
	   triangle.addPoint(650,400);
      triangle.addPoint(700,400);
      triangle.addPoint(650,350);
      g.fillPolygon(triangle);
	}
		
}



    
 