class localVariables {
  public static void main(String[] args) {
    int a = 99; 
    float b = 99.99f; 
    boolean c = true; 
    double d = 100.99; 

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}

/*

 * local variables are variables which are inside a method not inside a class
 *  jvm allocates memory of the local variables inside the STACK segment but without the default values
 * then the JVM assigns the actual values in the STACK segment
 * then we can access or print the values

 */