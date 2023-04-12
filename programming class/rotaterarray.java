import java.util.Scanner;

public class rotaterarray   
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++)
        {
            a[i] = scan.nextInt();
        }
        
        int[] b = new int[a.length];

        for(int i = 0; i < a.length ; i++)
        {
            b[(i+k)%n] = a[i];
        }

        for(int i = 0; i < b.length ; i++)
        {
            System.out.print(b[i]);
        }
        
    }
}