import java.util.Scanner;

class notebooks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        for(int i = 0; i <t; t ++)
        {
            int n = sc.nextInt();

            System.out.println(n*10);
        }
    }
    
}
