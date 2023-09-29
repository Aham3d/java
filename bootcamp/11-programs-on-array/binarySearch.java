public class binarySearch {
  public static void main(String[] args) {
    int [] a = {3, 5, 6, 8, 12, 15, 16, 19, 21}; 
    int key = 13; 
    System.out.println(binarySearch(a, key));
  }

  static int binarySearch(int [] a, int key) {
    int low = 0, high = a.length-1, mid = 0; 

    while(low<=high) {
     mid = (low+high) / 2; 

     if(key == a[mid]) {
      return mid; 
     } else if(key <= a[mid]) {
      high = mid-1; 
     } else {
      low = mid+1; 
     }
    }
    return -1;
  }
}
// revise(sep)