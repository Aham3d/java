import java.util.Scanner;

public class subString {
  
  static String subString(String s, int startIndex) {
    String t = "";
    for(int i = startIndex; i < s.length(); i++) {
      t = t + s.charAt(i); 
    }
    return t;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String s = sc.nextLine(); 
    int startIndex = sc.nextInt(); 

    System.out.println(subString(s, startIndex));
  }

}
