

import java.util.Scanner;

public class hurdlerace   
{

  static int hurdleRace(int k, int[] a)
  {
    
    int max = 0;

    for(int i = 0; i < a.length; i++)
    {
      if(a[i] > max)
      {
        max = a[i];
      }
    }
    int res = max - k; 
    if(res > 0)
    {
      return res;
    }
    else
    {
      return 0;
    }

  }

  public static void main(String[] args)
  {
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();  
    int k = scan.nextInt();

    int[] a = new int[n];
   
    for(int i = 0; i < a.length; i++)
   {
      a[i] = scan.nextInt();
   } 

   System.out.println(hurdlerace.hurdleRace(k, a));

    

  }
}
