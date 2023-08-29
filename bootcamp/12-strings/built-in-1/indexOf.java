import java.util.Scanner;

public class indexOf {

  static int indexOf(String s, String c) {
    char key = c.charAt(0); 

    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == key) {
        return i; 
      }
    }

    return -1; 
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    String s = sc.nextLine(); 
    String c = sc.nextLine(); 

    System.out.println(indexOf(s, c));
  }

}
