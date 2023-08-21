import java.util.Scanner;

public class arrayRotation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    int n = sc.nextInt(); 
    int k = sc.nextInt(); 
    int q = sc.nextInt(); 
    int[] a = new int[n]; 
    int[] queries  = new int[q]; 

    for(int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt(); 
    }

    for(int i = 0; i < queries.length; i++) {
      queries[i] = sc.nextInt(); 
    }

    int[] res = arrayRotation(a, k, queries);

    for(int i = 0; i < res.length; i++) {
      System.out.println(res[i]);
    }

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
// done