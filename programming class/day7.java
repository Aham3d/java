import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

// class naturalN
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
    
//         int n = scan.nextInt();

//         for(int i = 1; i<=n-1; i++)
//         {
//             System.out.print(i);
//         }
        
//     }
   
// }




// class naturalN // reverse 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
    
//         int n = scan.nextInt();

//         for(int i = n; i>0; i--)
//         {
//             System.out.print(i);
//         }
        
//     }
   
// }

// class naturalN // even 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         int n = scan.nextInt();

//         for(int i = 1; i <= n; i++)
//         {
//              if(i%2 == 0)
//              {
//                 System.out.println(i);

//              }
//         }
//     }
// }


// class table // table of 5
// {
//     public static void main(String[] args) {
        
//         Scanner scan = new Scanner(System.in);
        
//         int n = scan.nextInt();
//         for( int i = 1; i <= 10; i++)
//         {
//             System.out.println(n +" * "+ i +" = "+ (n*i));
//         }
//     }
// }

class factors // factors of the given value // 
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;  // to print the count of factors 

        for(int i = 1; i <= n; i ++)
        {
            if(n%i == 0)
            {
                count++;
                // System.out.println(i); // this will print the factors of the number 
            }
        }
        System.out.println(count);
    }
}