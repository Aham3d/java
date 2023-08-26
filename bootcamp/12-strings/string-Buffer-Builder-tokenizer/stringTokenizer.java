import java.util.StringTokenizer;

public class stringTokenizer {
  public static void main(String[] args) {
    
    String s = "java python sql ai"; 
    StringTokenizer st = new StringTokenizer(s); //default(s, " ") - cuts at the spaces
    StringTokenizer st1 = new StringTokenizer(s, "a"); //(s, "a") - cuts at the 'a'
    

    while(st.hasMoreTokens()) { //without the while loop op - java
      System.out.println(st.nextToken()); 
      /*
     * java
     * python 
     * sql 
     * ai
     */
    }
    while(st1.hasMoreTokens()) { 
      System.out.println(st1.nextToken()); 
      /*
     * j
     * v
     *  python sql
     * i
     */
    }

  }
}
