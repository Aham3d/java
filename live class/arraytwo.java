import java.util.Scanner; 

class arraytwo 

{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[][] a = new int[2][5];

    for (int i = 0; i < a.length; i++)
    {
      for(int j = 0; j > a[i].length; j++)
      {
        System.out.println("enter the age");
        a[i][j] = scan.nextInt();
      }
    }

    System.out.println("the ages are");

    for (int i = 0; i < a.length; i++)
    {
      for(int j = 0; j > a[i].length; j++)
      {
        System.out.println(a[i][j]);
        
      }
    }


  }
}