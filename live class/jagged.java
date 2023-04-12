// 2d jagged 


import java.util.Scanner;


class jagged {
  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);
    int[][] a =  new int [2][];
    a[0] = new int[3];
    a[1] = new int[5];

    for(int i = 0; i < a.length; i++)
    {
      for(int j = 0; j < a[i].length; j++)
      {
        System.out.println("enter the age of class"+i+"student"+j);
        a[i][j] = scan.nextInt();
      }
      System.out.println();
    }


    for(int i = 0; i < a.length; i++)
    {
      for(int j = 0; j < a[i].length; j++)
      {
        System.out.print(a[i][j]);
        
      }
      System.out.println();
    }
  }
}






// 3d jagged 