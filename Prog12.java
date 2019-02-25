// APCS2 Lab Test 1
//
// Prog12.java
//
// Random Color Rectangles
//
// Points: 5
//
////////////////////////////////////////////////////////////////////////////////
// Write a program that will draw 1000 random rectangles on an 800 by 600 applet window.
// Not only are these rectangles drawn in a random location; they have a random width (10-100 pixels),
// random heigth (10-100 pixels), and random color.  You also do not have complete use of the entire 
// 800 by 600 applet window.  There is a black border 100 pixels thick all around the applet window.
// No rectangles may be drawn on top of the black border.
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: You will need to load Prog12.html in order to execute this file.
//
// ALSO: The sample exection of this file is on the back of your lab test sheet.
//
// ALSO: On some computers, part of the output will not show up until you move the mouse.


import java.awt.*;
import java.applet.*;
import java.util.Random;


public class Prog12 extends Applet
{
	public void paint(Graphics g)
	{
      Random rand = new Random();
      for (int i=0; i<1000; i++)
         {
            g.setColor(Color.black);
            g.drawRect(100,100,800,600);
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
      	   g.setColor(new Color(red,green,blue));
            int width = rand.nextInt(90)+10;
            int height = rand.nextInt(90)+10;
            int x = rand.nextInt(800-width)+100;
            int y = rand.nextInt(600-height)+100;
            g.fillRect(x,y,width,height);
         }		
	}
}

