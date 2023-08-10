package patterns;
// public class Nptrns
// {
//     public static void main(String[] args)
//     {
//         int n = 5;
//         int count = 1;
//         for(int i = 0 ; i < n; i++)
//         {
//             for(int j =0; j < n; j++)
//             {
//                 if(count < 10)
//                 {
//                     System.out.print("0");
//                 }
//                 System.out.print(count++ + " ");
//             }
//             System.out.println();
//         }
        
        
//     }
    
// }

// public class Nptrns
// {
//     public static void main(String[] args)
//     {
//         int n = 5;
//         for(int i = 1 ; i <= n; i++)
//         {
//             for(int j =1; j <= n; j++)
//             {
//                 if(i*j < 10)
//                 {
//                     System.out.print("0");
//                 }
//                 System.out.print(i*j + " ");
//             }
//             System.out.println();
//         }
        
        
//     }
    
// }

public class Nptrns
{
    public static void main(String[] args)
    {
        int n = 5;
        int count;
        for(int i = 0 ; i < n; i++)
        {
            count = i+1;
            for(int j =0; j < n; j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        
        
    }
    
}

