import java.util.Scanner;

public class replace {

  static char[] toCharArray(String str) {
    char[] c = new char[str.length()]; 

    for(int i = 0; i < str.length(); i++) {
      c[i] = str.charAt(i); 
    }
    return c; 
  }
  
  static String replace(String str, char old_char, char new_char) {
    char[] s = toCharArray(str); 

    for(int i = 0; i < s.length; i++) {
      if(s[i] == old_char) {
        s[i] = new_char; 
      }
    }

    return new String(s); 
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String str = sc.nextLine(); 
    char old_char = sc.next().charAt(0); 
    char new_char = sc.next().charAt(0); 

    System.out.println(replace(str, old_char, new_char));
  }

}
