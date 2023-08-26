public class wrapperClass {

  // PRIMITIVE DATE TYPES
  byte a = 46; 
  short b = 1024; 
  int c = 99999; 
  long d = 3983435L; 
  float e = 45.5f; 
  double f = 4.5; 
  char g = 'A'; 
  boolean h = true; 
  

  // WRAPPER CLASS
  // java is not a pure object oriented language. 
  // because it does not treat date types as on object
  // using wrapper class we can convert it to objects
  // but primitive data types are faster compared to wrapper class
  boolean i = new boolean(true); 
  
  
  public static void main(String[] args) {
    wrapperClass wr = new wrapperClass(); 

    System.out.println(wr.a); 
  }


}
