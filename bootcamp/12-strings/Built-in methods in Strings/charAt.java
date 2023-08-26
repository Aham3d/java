public class charAt {

  public static void main(String[] args) {
    
    /*
     * String are series of characters
     * or
     * array of characters
     * Strings cannot be accessed directly
     * but can accessed indirectly - CharAt()
     */
    
    String s = "abcd"; 
    System.out.println(s);
    System.out.println(s.charAt(2));


    areImmutable(); 
  }

  static String areImmutable() {
    String s = "abcd"; // memory allocated in the constant pool inside the heap segment
    System.out.println(s); //abcd
    s = s.concat("efgh"); // allocates new memory in the non-constant pool for the "abcd" and concat "efgh" 
    // - which means that previous reference(1000) gets replaced by new reference(2000)  
    // - and the memory is collected by garbage value as doesn't have any reference
    System.out.println(s); //"abcdefgh"

    return s; 
  }

}
