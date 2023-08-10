import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int i = 0; i < t; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt(); 

			x = x*100;
			y = y*10;

			if(x<y)
			{
				System.out.println("disposable");
			}
			else if(y<x)
			{
				System.out.println("Cloth");
			}
			else
			{
				System.out.println("Cloth");
			}
			
		}
		
	}
}