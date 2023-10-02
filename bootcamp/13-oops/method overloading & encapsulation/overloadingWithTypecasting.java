public class overloadingWithTypecasting {
  
  public static void main(String[] args) {
     calculate c = new calculate(); 
     
     System.out.println(c.add(10, 20));
  }

}

class calculate {
  double add(int a, float b) { // executes this method
    System.out.println("1");
    return a+b; 
  }

  double add(float a, float b) {
    System.out.println("2");
    return a+b;
  }
}
// quick revise
// revise(sep)