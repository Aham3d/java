import java.util.Scanner;

public class subString2 {
  
  static String subString(String s, int startIndex, int endIndex) {
    String t = ""; 
    for(int i = startIndex; i < endIndex; i++) {
      t = t + s.charAt(i); 
    }
    return t;  
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String s = sc.nextLine();
    int startIndex = sc.nextInt(); 
    int endIndex = sc.nextInt(); 

    System.out.println(subString(s, startIndex, endIndex));;
  }

}
