import java.util.Scanner;

public class threeDarrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    // schools
    int[][][] a = new int[2][][];
    // classrooms of school 1
    a[0] = new int[3][];
    // classrooms of school 2
    a[1] = new int[2][];
    // students of classroom from school 1
    a[0][0] = new int[2]; 
    a[0][1] = new int[3];
    a[0][2] = new int[3]; 
    // students of classrooms from school 2 
    a[1][0] = new int[2]; 
    a[1][1] = new int[3];

    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        for(int k = 0; k < a[i][j].length; k++) {
          System.out.println("enter the age of class "+i +" classroom "+j +" student "+k);
          a[i][j][k] = sc.nextInt(); 
        }
      }
    }

    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        for(int k = 0; k < a[i][j].length; k++) {
          System.out.println(a[i][j][k]);
        }
      }
    }
  }
}
