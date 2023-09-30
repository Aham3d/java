import java.util.Scanner;

public class toUpperClass {
  
  static String toUpperClass(String s) {
    String t = " "; 

    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i); 
      if(c >= 'a' && c <= 'z') {
        t += (char) (c - 32); 
      } else {
        t += c;
      }
    }
    return t; 
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String s = sc.nextLine(); 

    System.out.println(toUpperClass(s));
  }

}
// revise(sep)