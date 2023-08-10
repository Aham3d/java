package arrays;

import java.util.Scanner;

class frequencyofanarray
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt(); 
      int[] ar = new int[n];

      for(int i = 0; i < ar.length; i++) 
      {
        ar[i] = sc.nextInt();
      }
      int k = sc.nextInt();

      System.out.println(findfrequency(ar,k)); 
        
        
    }

    static int findfrequency(int[] ar, int k)
    {
      int count = 0; 
      for(int i = 0; i < ar.length; i++)
      {
        if(ar[i] == k)
        {
          count++;
        }
      }
      return count; 
    }
}