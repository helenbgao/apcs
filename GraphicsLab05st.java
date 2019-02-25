// GraphicsLab05st.java
// This is the student, starting file of Lab10GRFX05 which draws 3 flags.
// Students need to create 10 more flags.  They will not know which flags these are ahead of time.
// Each of flag will be worth 10 points.  There will also be 2 bonus flags worth 5 points each.

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class GraphicsLab05st extends Applet
{
	static int numDots;
	static Random rand;
	
	public void init()
	{
		numDots = 1000000;  // number of dots drawn for each flag
		rand = new Random();
	}
	
	public void paint(Graphics g)
	{	
		titlePage(g,"Helen Gao",2);
//		flagOfLibya(g, numDots);
// 		flagOfMonaco(g, numDots);	
// 		flagOfItaly(g, numDots);	

       flagOfIreland(g, numDots);	
//       flagOfFrance(g, numDots);	
//       flagOfRomania(g, numDots);	
//       flagOfBelgium(g, numDots);
      
      flagOfHolland(g, numDots);
//      flagOfGermany(g, numDots);
//      flagOfEstonia(g, numDots);

      flagOfBariya1(g, numDots);
      flagRainbow(g, numDots);
       flagOfSweden(g, numDots);
//       flagOfDenmark(g, numDots);
       flagOfSeychelles(g, numDots);

flagOfSouthAfrica(g, numDots);
	}
	
	public static void titlePage(Graphics g, String name, int period)
	{
		g.setColor(Color.yellow);
		g.fillRect(0,0,1000,650);
		g.setColor(Color.white);
		g.fillRect(100,100,800,450);		
		g.setColor(Color.red);
		Font title = new Font("Algerian",Font.BOLD,48);
		g.setFont(title);
		g.drawString("Flags of the World",225,240);
		g.setColor(Color.blue);
		g.drawString("by: "+name,225,340);
		g.setColor(Color.green);
		g.drawString("Period: "+period,225,440);		
		delay(3000);                      // Wait 3 second before showing first flag.
	}
	
	public static void showName(Graphics g, String name)
	{
		g.setColor(Color.white);
		g.fillRect(25,50,30*(name.length()+3),70);		
		g.setColor(Color.black);
		Font countryName = new Font("Algerian",Font.BOLD,48);
		g.setFont(countryName);
		g.drawString(name,50,100);
		delay(2000);                      // Wait 2 second before showing next flag.
	}	
	
	public static void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}
	
	public static void flagOfLibya (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			g.setColor(Color.green);  	   // The Libyan flag is the simplest in the world.
											   // It is a solid green rectangle.
			g.fillRect(x,y,3,3);
		}
		showName(g,"Libya");		
	}
	
	public static void flagOfMonaco (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 325)                       // top stripe 
				g.setColor(Color.red);  
			else				    		   // bottom stripe 
				g.setColor(Color.white);   
			
			g.fillRect(x,y,3,3);
		}
		showName(g,"Monaco");			
	}	
	
	public static void flagOfItaly (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.green);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Italy");		
	}
   
	public static void flagOfIreland (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.green);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.yellow);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Ireland");		
	}	
   	
	public static void flagOfFrance (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.blue);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"France");		
	}		
   
	public static void flagOfRomania (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.blue);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.yellow);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Romania");		
	}		
   
	public static void flagOfBelgium (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (x < 333)                       // left stripe 
				g.setColor(Color.black);  
				
			if (x >= 333 && x < 667)		   // middle stripe requires compound condition
				g.setColor(Color.yellow);   
			
			if (x >= 667)                      // right stripe 
				g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Belgium");		
	}		   	
   
   public static void flagOfHolland (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.red);  
				
			if (y >= 217 && y < 434)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (y >= 434)                      // right stripe 
				g.setColor(Color.blue);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Holland");		
	}	  
   
   public static void flagOfGermany (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.black);  
				
			if (y >= 217 && y < 434)		   // middle stripe requires compound condition
				g.setColor(Color.red);   
			
			if (y >= 434)                      // right stripe 
				g.setColor(Color.yellow);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Germany");		
	} 	
   
   public static void flagOfEstonia (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 217)                       // left stripe 
				g.setColor(Color.blue);  
				
			if (y >= 217 && y < 434)		   // middle stripe requires compound condition
				g.setColor(Color.black);   
			
			if (y >= 434)                      // right stripe 
				g.setColor(Color.white);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Estonia");		
	}
   
   public static void flagOfBariya1 (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 162)                       // left stripe 
				g.setColor(Color.red);  
				
			if (y >= 162 && y < 324)		   // middle stripe requires compound condition
				g.setColor(Color.white);   
			
			if (y >= 324 && y < 487)          // right stripe 
				g.setColor(Color.red);
            
    	   if (y >= 487)                      // right stripe 
			g.setColor(Color.white);       			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Bariya 1");		
	}
   
   public static void flagRainbow (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (y < 108)                       // left stripe 
				g.setColor(Color.red);  
				
			if (y >= 108 && y < 216)		   // middle stripe requires compound condition
				g.setColor(Color.orange);
            
			if (y >= 216 && y < 324)		   // middle stripe requires compound condition
				g.setColor(Color.yellow);
            
			if (y >= 324 && y < 432)		   // middle stripe requires compound condition
				g.setColor(Color.green);
            
			if (y >= 432 && y < 540)		   // middle stripe requires compound condition
				g.setColor(Color.blue);                          
			            
    	   if (y >= 540)                      // right stripe 
			   g.setColor(new Color(255, 0, 255));       			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Rainbow");		
	}
   
   public static void flagOfSweden (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (((x>300)&&(x<400))||((y>275)&&(y<375)))                       // left stripe 
				g.setColor(Color.yellow);  
				
			else
            g.setColor(Color.blue);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Sweden");		
	}
   
   public static void flagOfDenmark (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
		for (int d = 1; d <= numDots; d++)
		{
			int x = rand.nextInt(1000);       // random x value of each dot
			int y = rand.nextInt(650);        // random y value of each dot
			
			if (((x>300)&&(x<400))||((y>275)&&(y<375)))                       // left stripe 
				g.setColor(Color.white);  
				
			else
            g.setColor(Color.red);  			
		
			g.fillRect(x,y,3,3);
		}
		showName(g,"Denmark");		
	}   
   
   public static void flagOfSeychelles (Graphics g, int numDots)
	{
		g.setColor(Color.black);  
		g.fillRect(0,0,1000,650);
         g.setColor(Color.blue);
         Polygon triangle = new Polygon(); 			
         triangle.addPoint(0,0);
         triangle.addPoint(300,0);
         triangle.addPoint(0,650);		
			g.fillPolygon(triangle);
         
         g.setColor(Color.yellow);
         Polygon t2 = new Polygon(); 			
         t2.addPoint(0,650);
         t2.addPoint(300,0);
         t2.addPoint(600,0);		
			g.fillPolygon(t2);
         
         g.setColor(Color.red);
         Polygon t3 = new Polygon(); 			
         t3.addPoint(0,650);
         t3.addPoint(600,0);
         t3.addPoint(1000,0);
         t3.addPoint(1000,217);		
			g.fillPolygon(t3);
         
         g.setColor(Color.white);
         Polygon t4 = new Polygon(); 			
         t4.addPoint(0,650);
         t4.addPoint(1000,217);
         t4.addPoint(1000,434);		
			g.fillPolygon(t4);
         
         g.setColor(Color.green);
         Polygon t5 = new Polygon(); 			
         t5.addPoint(0,650);
         t5.addPoint(1000,434);
         t5.addPoint(1000,650);		
			g.fillPolygon(t5);
		showName(g,"Seychelles");		
	}

   public static void flagOfSouthAfrica (Graphics g, int numDots)
	{
		g.setColor(Color.green);  
		g.fillRect(0,0,1000,650);	
         g.setColor(Color.yellow);
         Polygon triangle = new Polygon(); 			
         triangle.addPoint(0,100);
         triangle.addPoint(300,325);
         triangle.addPoint(0,550);		
			g.fillPolygon(triangle);
         
         g.setColor(Color.black);
         Polygon t2 = new Polygon(); 			
         t2.addPoint(0,125);
         t2.addPoint(275,325);
         t2.addPoint(0,525);		
			g.fillPolygon(t2);
         
         g.setColor(Color.white);
         Polygon t3 = new Polygon(); 			
         t3.addPoint(300,0);
         t3.addPoint(1000,0);
         t3.addPoint(1000,200);
         t3.addPoint(600,200);		
			g.fillPolygon(t3);
         
         g.setColor(Color.red);
         Polygon t4 = new Polygon(); 			
         t4.addPoint(325,0);
         t4.addPoint(1000,0);
         t4.addPoint(1000,175);
         t4.addPoint(600,175);		
			g.fillPolygon(t4);
         
         g.setColor(Color.white);
         Polygon t5 = new Polygon(); 			
         t5.addPoint(300,650);
         t5.addPoint(1000,650);
         t5.addPoint(1000,450);
         t5.addPoint(600,450);		
			g.fillPolygon(t5);
         
         g.setColor(Color.blue);
         Polygon t6 = new Polygon(); 			
         t6.addPoint(325,650);
         t6.addPoint(1000,650);
         t6.addPoint(1000,425);
         t6.addPoint(600,425);		
			g.fillPolygon(t6);
		
         showName(g,"South Africa");		
	}
}

