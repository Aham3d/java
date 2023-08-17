import java.util.Scanner;

public class triangleGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    System.out.println("enter the angle 1");
    int a = sc.nextInt(); 
    System.out.println("enter the angle 2");
    int b = sc.nextInt(); 
    System.out.println("enter the angle 3");
    int c = sc.nextInt(); 

    anglesCheck(a, b, c);

  }

  static void anglesCheck(int a, int b, int c) {
    if( (a+b+c) == 180) {
      if(a == 60 && b == 60 && c == 60) {
        System.out.println("prize 3");
      } else if(a == 90 || b == 90 || c == 90) {
        System.out.println("prize 2");
      } else {
        System.out.println("prize 1");
      }
    } else {
      System.out.println("no prize");
    }
  }
}
