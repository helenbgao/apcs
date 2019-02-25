// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);	
		
      for (int i=0; i<50; i++)
         {
            g.drawLine(x1,y1,x2,y2);
            x1 += 20;
            y2 -= 12; 
         }
      
      x1 = 990;
		y1 = 640;
		x2 = 10;
		y2 = 640;
      
      for (int i=0; i<50; i++)
         {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 20;
            y2 -= 12;
         }
         
      x1 = 990;
		y1 = 10;
		x2 = 10;
		y2 = 10;
      
      for (int i=0; i<50; i++)
         {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 20;
            y2 += 12;
         }
         
      x1 = 10;
		y1 = 10;
		x2 = 990;
		y2 = 10;
      
      for (int i=0; i<50; i++)
         {
            g.drawLine(x1, y1, x2, y2);
            x1 += 20;
            y2 += 12;
         }
   
   g.drawRect(250,160,500,330);
   
   x1 = 250;
	y1 = 490;
	x2 = 750;
	y2 = 490;	
   
   for (int i=0; i<50; i++)
         {
            g.drawLine(x1,y1,x2,y2);
            x1 += 10;
            y2 -= 6; 
         }
      
      x1 = 750;
		y1 = 490;
		x2 = 250;
		y2 = 490;
      
      for (int i=0; i<50; i++)
         {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 10;
            y2 -= 6;
         }
         
      x1 = 750;
		y1 = 160;
		x2 = 250;
		y2 = 160;
      
      for (int i=0; i<50; i++)
         {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 10;
            y2 += 6;
         }
         
      x1 = 250;
		y1 = 160;
		x2 = 750;
		y2 = 160;
      
      for (int i=0; i<50; i++)
         {
            g.drawLine(x1, y1, x2, y2);
            x1 += 10;
            y2 += 6;
         }
	}
}

