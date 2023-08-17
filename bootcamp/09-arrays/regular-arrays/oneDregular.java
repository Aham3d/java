// an array to store the ages of 5 students 

import java.util.Scanner;

public class oneDregular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5]; 

		for(int i = 0; i < a.length; i++) {
			System.out.println("enter the age");
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}