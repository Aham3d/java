import java.util.Scanner;

class sharktank 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        while(n-->0)
        {
            int a = sc.nextInt(); 
            int b = sc.nextInt();
            a = a*10;
            b = b*5;  // correction from 20 to 5 ( mistake in the question)
            if(a>b)
            {
                System.out.println("FIRST");
            }
            else if(a<b)
            {
                System.out.println("second");

            }
            else
            {
                System.out.println("Any");
                
            }
        }
    }
    

    
}
