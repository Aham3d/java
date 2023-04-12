import java.util.Scanner;

// create and array to store the ages of 5 students 

public class arryas2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            //1d array
        // int[] a = new int[5];
        // inefficient way to use array
        // System.out.println("enter the age");
        // a[0] = sc.nextInt();
        // System.out.println("enter the age");
        // a[1] = sc.nextInt();
        // System.out.println("enter the age");
        // a[2] = sc.nextInt();
        // System.out.println("enter the age");
        // a[3] = sc.nextInt();
        // System.out.println("enter the age");
        // a[4] = sc.nextInt();
        // System.out.println("the ages are:");
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);


        //efficient way to use array
        // for(int i = 0; i < a.length; i++)
        // {
        //     System.out.println("enter the age");   
        //     a[i] = sc.nextInt(); 
        // }
        // System.out.println("the ages are:");
        // for(int i = 0; i < a.length; i++)
        // {
        //     System.out.println(a[i]);
        // }



        // 2d array 
        // int[][] a = new int[2][5];

        // for(int i = 0; i < a.length; i++)
        // {
        //     for(int j = 0; j < a[i].length; j++)
        //     {
        //         System.out.println("enter  the age of class "+i+" student "+j);
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("the ages are");
        // for(int i = 0; i < a.length; i++)
        // {
        //     for(int j = 0; j < a[i].length; j++)
        //     {
        //         System.out.println(a[i][j]);
        //     }
        // }


        // 3d array 
        int [][][] a = new int[2][3][5];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                for(int k = 0; k < a[i][j].length; k++)
                {
                    System.out.println("enter the ages of school "+i+" class "+j+" student "+k);
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("the ages are");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                for(int k = 0; k < a[i][j].length; k++)
                {
                    System.out.println(a[i][j][k]);
                }
            }
        }


    }

    
}
