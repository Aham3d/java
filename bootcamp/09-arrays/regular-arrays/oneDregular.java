package java;

import java.util.Scanner;

public class oneDregular {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] a = new int[5]; 
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("enter the age"); 
			a[i] = sc.nextInt(); 
		}
		
		System.out.println("the ages are"); 
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
