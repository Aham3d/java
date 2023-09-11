import java.util.Scanner;

public class palindrome {

  static String reverseString(String s) {
    String t = ""; 

    for(int i = s.length() -1 ; i >= 0; i--) {
      t += s.charAt(i); 
    }

    return t; 
  }

  static boolean palindrome(String s) {
    if(s.equals(reverseString(s))) {
      return true; 
    } 
    return false; 
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String s = sc.nextLine(); 

    System.out.println(palindrome(s));
  }

}
