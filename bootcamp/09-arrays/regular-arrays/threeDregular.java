import java.util.Scanner;

public class threeDregular {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int[][][] a = new int[2][3][5];

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
// revise(sep)