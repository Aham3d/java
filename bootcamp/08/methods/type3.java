// 3.input, no output
public class type3 {
  int c; 

  void add(int a, int b) {
    c = a+b;
    System.out.println(c);
  }

  public static void main(String[] args) {
    type3 calc = new type3(); 
    int num1 = 50; 
    int num2 = 40; 
    calc.add(num1, num2);
  }
}
