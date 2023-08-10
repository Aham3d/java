import java.util.Scanner;

public class day2 
{
    // public static void main(String[] args) 
    // {
    //     Scanner scan = new Scanner(System.in);

    //     int n = scan.nextInt();

    //     for(int i = 0; i < n; i++)
    //     {
    //         for(int j = 0; j < n; j++)
    //         {
    //             if(i==0 || i==n-1 || j==0 || j==n-1 
    //             || i==n/2 || j==n/2
    //             || i==j || j+i==n-1 
    //             || i-j==n/2 || i+j==n/2 
    //             || j-1==n/2
    //             || i+j==n+n/2-1)
    //             {
    //                 System.out.print("* ");
    //             }
    //             else
    //             {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }

    // }


    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0; i < n; i++)    
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 && j != 0 && j != n-1 
                || j == 0 && i != n-1 && i != n-1
                || i == n-1 && j < n/2 && j > 0
                || i == 3*n/4 && j > n/2 && j < n-1
                || j == n/2 && i > n/2 && i < n-1
                || j == n-1 && i > 3*n/4
                || j == n-1 && i > 0 && i < n/4 )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
