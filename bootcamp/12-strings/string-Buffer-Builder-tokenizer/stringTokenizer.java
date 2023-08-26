import java.util.StringTokenizer;

public class stringTokenizer {
  public static void main(String[] args) {
    
    String s = "java python sqp ai"; 
    StringTokenizer st = new StringTokenizer(s); 

    while(st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

  }
}
