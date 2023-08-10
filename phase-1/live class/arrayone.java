

import java.util.Scanner;

public class arrayone 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];

    for(int i = 0; i < 5; i++)
    {
      System.out.println("Enter the age");
      a[i] = scan.nextInt();
    }
      System.out.println("the ages are");

    for( int i = 0; i < 5; i++)
    {
      System.out.println(a[i]);
    }

  }
  

} 
