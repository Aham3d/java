import java.util.Scanner;

public class selectionSort {

  static void selectionSort(int [] ar) {
    for(int i = 0; i < ar.length; i++) {
      int min_i = i; 
      for(int j = i+1; j < ar.length; j++) {
        if(ar[j] < ar[min_i]) {
          min_i = j;
        }
      }
      int temp = ar[i]; 
      ar[i] = ar[min_i]; 
      ar[min_i] = temp;
    }
  }

  public static void main(String[] args) {

    int [] ar = {5, 7, 9, 1, 3}; 
    
    for(int i = 0; i < ar.length; i++) {
      System.out.println(ar[i] + " ");
    }
    System.out.println(" ");

    selectionSort(ar);

    for(int i = 0; i < ar.length; i++) {
      System.out.println(ar[i] + " ");
    }
  }

}
