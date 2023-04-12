import java.util.Scanner;

public class arrays3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        // 2d jagged array // 2 class rooms and 3 students in class 1 and 5 students in class 2
        // int [][] a = new int [2][];
        // a[0] = new int[3];
        // a[1] = new int[5];

        // for(int i =0; i < a.length; i++)
        // {
        //     for(int j = 0; j < a[i].length; j++)
        //     {
        //         System.out.println("enter the age of class "+i+"student"+j);
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("the ages are : ");
        // for(int i = 0; i < a.length; i++)
        // {
        //     for(int j = 0; j < a[i].length; j++)
        //     {
        //         System.out.println(a[i][j]);
        //     }
        // }


        // 3d jagged  array (2 school, )
            int [][][] a = new int[2][][]; // scchool 
            a[0] = new int[3][]; // class 1
            a[1] = new int[2][]; // class 2
            a[0][0] = new int[2]; // student 
            a[0][1] = new int[3];
            a[0][2] = new int[3];
            a[1][0] = new int[2];
            a[1][1] = new int[3];

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
