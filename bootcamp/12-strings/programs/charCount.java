public class charCount {
  public static void main(String[] args) {
    String s = "how are youo o"; 
    String t = "o";

    System.out.println(charCount(s, t));
  }

  static int charCount(String s, String t) {
    int count = 0; 
    char key = t.charAt(0); 
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == key) {
        count++; 
      }
    }
    return count; 
  }
}
