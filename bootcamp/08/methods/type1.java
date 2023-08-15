// syntax
/*
  * return_type(4) name(1)(parameters(2)) {
  *  statements(3)
  *      .
  *      .
  * }
  */

//  types of methods

// 1.no input, no output
class type1 {
  int a = 50; 
  int b = 40; 
  
  void add() {
    int c = a+b; 
    System.out.println(c);
  }

  public static void main(String[] args) {
    type1 calc = new type1(); 
    calc.add();
  }
}


