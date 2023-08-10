

import java.util.Scanner;

public class angryprofessor 
{

    static String angryprofessor(int k, int[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= 0)
            {
                count++;
            }    
        }
        if(count >= k)
        {
            return "no";
        }
        else
        {
            return "yes";
        }
    }
    

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n]; 

        for( int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }
        String res = angryprofessor(k, arr);
        System.out.println(res);

    }

}
