import java.util.Scanner;

public class migrataryBirds {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt();
    
    int[] a = new int[n];
    // int[] a = {1, 2, 2, 3, 4,}; 

    for(int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt(); 
    }

    System.out.println(migrataryBirds(a));
  }

  static int   migrataryBirds(int[] a) {
    int[] birds = new int[a.length]; 

    for(int i = 0; i < a.length; i++) {
      birds[a[i]]++; 
    }

    int maxIndex = 0, max = -1; 

    for(int i = 1; i < birds.length; i++) {
      if(birds[i] > max) {
        max = birds[i]; 
        maxIndex = i; 
      }
    }
    return maxIndex; 
  }

}
