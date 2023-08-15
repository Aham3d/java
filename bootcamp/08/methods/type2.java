// 2. no input, output

public class type2 {
  int a = 50; 
  int b = 40; 

  int add() {
    int c = a+b; 
    return c;
  }

  public static void main(String[] args) {
    type2 calc = new type2(); 
    System.out.println(calc.add()); 
  }
}
