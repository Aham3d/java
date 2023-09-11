import java.util.Scanner;

public class removeVowels {

  static String removeVowels(String s) {
    String t = ""; 

    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i); 
      if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {

      } else {
        t = t + c; 
      }
    }
    return t; 
  }
 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 
    String s = "abcdea"; 

    System.out.println(removeVowels(s));
  }

}