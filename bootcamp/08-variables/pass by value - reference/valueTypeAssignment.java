public class valueTypeAssignment {
  public static void main(String[] args) {
    int x = 100; 
    int y; 
    y=x; 

    System.out.println(x); //100
    System.out.println(y); //100

    x = 200; 

    System.out.println(x); //200
    System.out.println(y); //100
  }
}
