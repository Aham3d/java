import java.util.Scanner;

public class walkWidth {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt(); 
    int h = sc.nextInt(); 
    int [] a = new int[n]; 

    for(int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt(); 
    }
    System.out.println(walkWidth(a, h));  
  }

  static int walkWidth(int[] a, int h) {
    int width = 0; 
    for(int i = 0; i < a.length; i++) {
      if(a[i] <= h) {
        width++; 
      } else {
        width = width + 2; 
      }
    }
    return width; 
  }
}
