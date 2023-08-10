package arrays;

import java.util.Scanner;

public class local {
    public static void main (String[] args) throws java.lang.Exception
	{
	
		// Scanner sc = new Scanner(System.in);
		
		// int t = sc.nextInt();
		
		// for(int i = 0; i < t; i++)
		// {
		//     int k = sc.nextInt();
		//     int x = sc.nextInt();
		
		    
		//     System.out.println(7*k-x);
		// }

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++)
		{
		    String b = sc.nextInt();
		    String c = sc.nextInt();
		    String d = sc.nextInt();
		    String f = sc.nextInt();
		    
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = sc.nextInt();
		    int F = sc.nextInt();
		    
		    if(b==B || B==b)
		    {
		        System.out.println("BattleShip");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}

}

