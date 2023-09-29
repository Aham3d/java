import java.util.Scanner;

public class linearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt(); 
    int[] a = new int[n]; 

    for(int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt(); 
    }

    System.out.println(linearSearch(a));

  }

  static int linearSearch(int [] a) {
    Scanner sc = new Scanner(System.in); 
    int key = sc.nextInt(); 
    for(int i = 0; i < a.length; i++) {
      if(a[i] == key) {
        return i; 
      }
    }
    return -1; 
  }
}
// revise(sep)