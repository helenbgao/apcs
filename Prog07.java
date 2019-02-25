// 	Prog07.java
//
// 	ALPHA CLASS   
//
//	Weight: 6
//
/////////////////////////////////////////////////////////////////////////
//
// Complete the Alpha class below.  The intention of the class is to assist
// in displaying graphics letters for a program that displays letters
// The benefit of the Alpha class is that you only need to specify the top-left 
// corner of the letter without any calculations where each part of the letter 
// needs to be located.
//
// For the purposes of this assignment you only need to do letters S,T,O,P.
//
//
// REQUIRED OUTPUT DISPLAY IN THE APPLET WINDOW WITH LARGE LETTERS:
//
// SPOTS
// STOPS
//
/////////////////////////////////////////////////////////////////////////


import java.awt.*;
import java.applet.*;



public class Prog07 extends Applet
{
	public void paint(Graphics g)
	{
		Alpha.draw(g,100,100,'S');
		Alpha.draw(g,180,100,'P');
		Alpha.draw(g,260,100,'O');
		Alpha.draw(g,340,100,'T');
		Alpha.draw(g,420,100,'S');	
		
		Alpha.draw(g,100,300,'S');
		Alpha.draw(g,180,300,'T');
		Alpha.draw(g,260,300,'O');
		Alpha.draw(g,340,300,'P');
		Alpha.draw(g,420,300,'S');	
	}
}


class Alpha
{
	public static void draw(Graphics g, int x, int y, char c)
	{
		switch(c)
		{
			case 'S': drawS(g,x,y); break;
			case 'P': drawP(g,x,y); break;
			case 'T': drawT(g,x,y); break;
			case 'O': drawO(g,x,y); break;
		}
	}
	

	
	
}

		
 


