import java.util.ArrayList;
 public class badPairs
  {  
   public static void main(String[] args) 
   {   
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(3);
      list.add(7);
      list.add(9);
      list.add(2);
      list.add(5);
      list.add(5);
      list.add(8);   
      list.add(5);   
      list.add(6);
      list.add(3);
      list.add(4);
      list.add(7);
      list.add(3);
      list.add(1);
      System.out.println(removeBadPairs(list));
   } 
   
   public static ArrayList removeBadPairs(ArrayList<Integer> list)
   {
      ArrayList<Integer> l = list;
      for (int i=(l.size()-2); i>=0; i-=2)
      {
         if (l.get(i)>l.get(i+1))
         {
            l.remove(i+1);
            l.remove(i);            
         }
      }
      return l;
   }
}