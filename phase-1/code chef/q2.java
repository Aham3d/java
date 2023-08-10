import java.util.Scanner;

class chefandchapters {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        {
            int t =sc.nextInt();
            int x,y,z; 

            for(int i = 0; i < t; i++)
            {
                x = sc.nextInt(); 
                y = sc.nextInt(); 
                z = sc.nextInt(); 

                System.out.println(x*y*z);
            }

        }
    }
    
}
