import java.util.Random;
public class Array2D
{
    public static void main(String[] args) 
    {
      int list1[][] = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};
      double sum1 = 0.0;
      for (int i=0; i<list1.length; i++)
      {
         for (int j=0; j<list1[i].length; j++)
         {
            sum1 += list1[i][j];
         }   
      }
      System.out.println("average list1: " + sum1/12);
      
      double sumReviewer2 = 0.0;
      for (int k = 0; k<list1[2].length; k++)
      {
         sumReviewer2 += list1[2][k];
      }
      System.out.println("average reviewer2 list1: " + sumReviewer2/4);
      
      double sumMovie2 = 0.0;
      for (int row = 0; row <list1.length; row++)
      {
         sumMovie2 += list1[row][2];
      }
      System.out.println("average movie2 list1: " + sumMovie2/3);
      
      int list2[][] = {{3,5,7,9},{4,2},{5,7,8,6},{6}};
      double sum2 = 0.0;
      for (int l=0; l<list2.length; l++)
      {
         for (int m=0; m<list2[l].length; m++)
         {
            sum2 += list2[l][m];
         }   
      }
      System.out.println("average list2: " + sum2/11);
      
      double sumRev2 = 0.0;
      for (int a = 0; a<list2[2].length; a++)
      {
         sumRev2 += list2[2][a];
      }
      System.out.println("average reviewer2 list2: " + sumRev2/4);
      
      double sumMov2 = 0.0;
      for (int c = 0; c<list2.length; c++)
      {
         if (list2[c].length>2)
         {  
            sumMov2 += list2[c][2];
         }
      }
      System.out.println("average movie2 list2: " + sumMov2/2);
      
      System.out.println();
      Random rand = new Random();
      int list[][] = new int[5][8];
      for (int i2=0; i2<5; i2++)
      {
         for (int j2=0; j2<8; j2++)
         {
            list[i2][j2] = rand.nextInt(56)+11;
            boolean check = check(list, i2, j2);
            while (check == true)
            {
               list[i2][j2] = rand.nextInt(56)+11;
               check = check(list, i2, j2);
            }
            System.out.print(list[i2][j2] + " ");
         }
         System.out.println();
      }   
    }
    
    public static boolean check(int[][] list, int x, int y)
    {
      boolean multiples = false;
      for (int a=0; a<x; a++)
      {
         for (int b=0; b<list[a].length; b++)
         {
            if ((list[x][y]==list[a][b]))
            {
               multiples = true;
            }
         }
      }
      
      for (int c=0; c<y; c++)
      {
         if ((list[x][y] == list[x][c]))
         {
            multiples = true;
         }
      }
      return multiples;
    }
}