// an array to store the ages of students belonging to 2 classrooms with 5 students each
import java.util.Scanner;

public class twoDregular {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] a = new int[2][5];
    
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.println("enter the age for classroom"+i + "student"+j);
        a[i][j] = sc.nextInt();
      }
    }

    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.println(a[i][j]);
      }
    }
  }
}
