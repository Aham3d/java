public class stringsIntro {
  
  public static void main(String[] args) {
    /*
    memory is allocated in the head segment inside the string pool
    and in string pool we have 
    1.constant pool 
    - strings created without using NEW keyword
    - dupclicates are not allowed
    2.non-constant pool 
    - strings are created using NEW keyword
    - duplicates are allowed 
    */

    // ways to create a string
    String s = new String("java"); 
    String a = "a-java"; 
    char[] b = {'b','j', 'a', 'v', 'a'};
    String c = new String(b);
    // System.out.println(c);



    // examples
    System.out.println(example1());
    System.out.println(example2());
  }

  // EXAMPLE 1 
  static String example1() {
    String s1 = "java"; 
    String s2 = "java"; 

    if(s1==s2) {
      return "reference is eqaul"; //OP
    } else {
      return "refernce is not equal"; 
    }
  }
  /* 
   * memroy is allocated in the HEAP segment inside the constant pool
   * because the object is created without using the NEW keyword
   * the reference s1 is created in stack segment which points to the string reference created in the HEAP segment
   * the reference s2 also points to the same string as s1
   * because in constant pool duplicated are not created 
   */

  // EXAMPLE 2
  static String example2() {
    String s1 = "java"; 
    String s2 = new String("java"); 

    if(s1.equals(s2)) {
      return "value is equal"; //OP
    } else {
      return "value is not equal";
    }
  }
    /* 
   * s1 memroy is allocated in the HEAP segment inside the constant pool because it is created without using the NEW keyword
   * the reference s1 is created in stack segment which points to the string reference(1000) created in the constant pool
   * s2 memory is allocated in the HEAP segment insdie the non-constant pool because it is created using the NEW keyword
   * the reference s2 is created in stack segment which points to the string reference(2000) created in the non-constant pool
   */

  // EXAMPLE 3
  static String example3() {
    String s1 = new String("java"); 
    String s2 = new String("java");

    if(s1==s2) {
      return "reference is equal";
    } else {
      return "reference is not equal"; //OP
    }
  }
    /* 
   * memroys for s1 and s2 is allocated in the HEAP segment inside the non-constant pool
   * because the object is created using the NEW keyword
   * the reference s1 is created in stack segment which points to the string reference created in the non-constact pool 
   * the reference s2 is created in stack segment which points to the another string reference created int the non-constant pool 
   * even though the values are same, as the memory is allocated in the non-constact pool it'll allocated memory for the duplicate pool
   * as duplicate are allowed in the non-constant pool 
   */

}