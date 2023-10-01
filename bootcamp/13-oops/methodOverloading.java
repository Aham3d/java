public class methodOverloading {
  
  public static void main(String[] args) {
    
    /*
     * can use same names for methods
     * ease of use
     * 
     * to resolve the naming conflict:
     * 1. no of parameters
     * 2. type of parameters
     * 3. order of type of parameters
     * 
     * method overloading also helps to achieve virtual polymorphism
     * 
     * nothing is overloaded in method overloading. it is just and illusion that one method is doing many things, 
     * but in reality various methods are there doing one thing each.
     */

    methodOverloading m = new methodOverloading(); 
    m.print(10.5f, 10); 
    m.print(10); 
    m.print(10.4f);
        
  }

  void print(int a) {
    System.out.println(a);
  }

  void print(float a) {
    System.out.println(a);
  }

  // void print(float a, int b) {
  //   System.out.println(a, b);
  // }

  // void print(int a, float b) {
  //   System.out.println(a,b);
  // }

}
// quick revise
// revise(sep)