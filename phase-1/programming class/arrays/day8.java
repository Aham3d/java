import java.util.Scanner;

class arrays 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] ar = new int[n]; 
        for(int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt(); 
        }
        for(int i = 0; i < ar.length; i++)
        {
           System.out.println(ar[i]+" ");
        }
    }
}

