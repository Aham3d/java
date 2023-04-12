import java.util.Scanner;

class tyreproblem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 

            int k = n*2 + m*4;
            System.err.println(k);
            
        }
    }
    
}
