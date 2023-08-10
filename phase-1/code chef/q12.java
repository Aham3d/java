import java.util.Scanner;

class chefparty {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt(); 
            int x = sc.nextInt();
            int k = sc.nextInt(); 

            if(n*x > k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
    
}
