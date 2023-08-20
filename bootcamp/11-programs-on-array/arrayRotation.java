import java.util.Scanner;

public class arrayRotation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    int n = sc.nextInt(); 
    int[] a = new int[n]; 
    int k = sc.nextInt(); 
    int[] q = new int[a.length]; 

    for(int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt(); 
    }

    System.out.println(arrayRotation(a, k, q));
  }

  static int[] arrayRotation(int[] a, int k, int[] q) {
    int[] res = new int[q.length]; 
    int [] b = new int[a.length]; 

    for(int i = 0; i < a.length; i++) {
      b[ ( i + k ) % a.length ] = a[i]; 
    }

    for(int i = 0; i < q.length; i++) {
      res[i] = b[q[i]];
    }
    return res; 
  }

}
