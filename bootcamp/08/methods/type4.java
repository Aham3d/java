// 4. input, output
public class type4 {
  int c; 
  
  int add(int a, int b) {
    c = a+b; 
    return c; 
  }

  public static void main(String[] args) {
    type4 calc = new type4();
    int num1 = 50; 
    int num2 = 50; 
    System.out.println(calc.add(num1, num2));
  }
}
