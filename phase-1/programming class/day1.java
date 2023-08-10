

// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);    
//         int age = scan.nextInt();
//         float weight = scan.nextFloat();
//         scan.nextLine();
//         String college = scan.nextLine();
        
//         System.out.println(college);
//         System.out.println(weight);
//         System.out.println(age);

//     }
// }




//  SQAURE OF STARS 
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);   
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// IF J == 0 THEN * ELSE $
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);   
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if( j == 0)
//                 {   
//                     System.out.print("*");
//                 }
//                 else    
//                 {
//                     System.out.print("$");
//                 }
                
//             }
//             System.out.println();
//         }
//     }
// }



// IF I & J == 0 THEN * ELSE $
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if( j == 0 || i == 0)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print("$");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// IF I == 0 AND J == 0 AND I == N -1 THEN * ELSE $
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if( j == 0 || i == 0 || i == n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print("$");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//  HOLLOW SQUARE OF STARS 

// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();

//        for(int i = 0; i < n; i++)
//        {
//             for(int j = 0; j < n; j++)
//             {
//                 if( i == 0 || j == 0 || i == n-1 || j == n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//        }
//     }
// }


// LETTER A 
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if( j == 0 || i == 0 || i == n/2 ||j == n-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// PROPPER LETTER A 
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if( i == 0 && j != 0 && j != n-1 || j  == 0 && i != 0 || j == n-1 && i != 0 ||i == n/2)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// PROPPER LETTER B 
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if( i == 0 && j != n-1 || j  == 0 && i != 0  && i != n-1|| j == n-1 && i != 0  && i != n-1 || i == n-1 && j != n-1 ||i == n/2)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// PROPPER LETTER D
// import java.util.Scanner;

// public class day1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if( i == 0 && j != n-1 || j  == 0 && i != 0 || i == n-1 && j != n-1 || j == n-1 && i != n-1 && i != 0)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }







import java.util.Scanner;

public class day1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
        {
            System.out.println("BTM");
        }
        else if( n % 3 == 0)
        { 
            System.out.println("tap");
        }
        else if (n % 5 == 0)
        { 
            System.out.println("academy");
        }
    }
}



