// day8

package arrays;

import java.util.Scanner;

// class toprintarray
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);

//         int n = scan.nextInt(); 
//         int[] ar = new int[n];

//         for(int i = 0; i < ar.length; i++)
//         {
//             ar[i]=scan.nextInt();
//         }

//         for(int i = 0; i < ar.length; i++)
//         {
//             if(i %2 == 0)           // to print values present in even index 
//             // if(ar[i] % 2 == 0)     // to print even number from the array
//             {
//                 System.out.print(ar[i]+" ");
//             }   
//         }
        
//     }
// }



class sumofarray
{
    public static void main(String[] args) 
    {
            
            // to print the sum of array 
        //     Scanner scan = new Scanner(System.in);

        //     int n = scan.nextInt();     
        //     int ar[] = new int[n];

        //     for(int i = 0; i < ar.length; i++)
        //     {
        //         ar[i] = scan.nextInt();
        //     }

        //     int sum = 0 ;
        //     for(int i = 0; i < ar.length; i++)
        //     {
        //         sum = sum +ar[i]; 
        //     }
        //     System.out.println(sum);
        // }


     // to print the largest numebr from the array XX
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();     
        int ar[] = new int[n];

        for(int i = 0; i < ar.length; i++)
        {
            ar[i] = scan.nextInt();
        }

        int max = findMax(ar);
        System.out.println(max);

    }

    static int findMax(int[] ar)
    {
        int max = 0;
        
        for(int i = 0; i < ar.length; i++)
        {
            if(ar[i] > max)
            {
                max = ar[i];

            }
        }
        return max; 
    }
}