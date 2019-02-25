//  Using the composition method, create the following program:
//  Computer is a Dell XPS Tower  --  Main Class
//  Motherboard is a ORW203
//  Ram is 16 gb. 
//  Monitor is a 32" widescreen.
//  ROM is 2TB
public class Computers
{
	public static void main(String[] args)
   {
	   Computer comp = new Computer("Dell XPS Tower", "ORW203", 16, 32, 2);
      comp.getData();
	}
}

class Computer
{
   private String type;
   Motherboard mb;
   RAM ram;
   Monitor monitor;
   ROM rom;
   
   public Computer(String t, String m, int ra, int mo, int ro)
   {
      type = t;
      mb = new Motherboard(m);
      ram = new RAM(ra);
      monitor = new Monitor(mo);
      rom = new ROM(ro);
   }
   
   public void getData()
   {
      System.out.println("Type: " + type);
      System.out.println("Motherboard: " + mb.getMotherboard());
      System.out.println("RAM: " + ram.getRAM() + "GB");
      System.out.println("Monitor: " + monitor.getMonitor()+ '"' + " widescreen");
      System.out.println("ROM: " + rom.getROM() + "TB");
   }
}

class Motherboard
{
   public String motherboard;
   
   public Motherboard(String m)
   {
      motherboard = m;
   }
   
   public String getMotherboard()
   {
      return motherboard;
   }
}

class RAM
{
   public int ram;
   
   public RAM(int r)
   {
      ram = r;
   }
   
   public int getRAM()
   {
      return ram;
   }
}

class Monitor
{
   public int mo;
   
   public Monitor(int m)
   {
      mo = m;
   }
   
   public int getMonitor()
   {
      return mo;
   }
}

class ROM
{
   public int rom;
   
   public ROM(int r)
   {
      rom = r;
   }
   
   public int getROM()
   {
      return rom;
   }
}