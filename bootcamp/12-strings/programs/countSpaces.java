public class countSpaces {

  public static void main(String[] args) {
    String st = "how are you ";

    System.out.println(spaceCount(st));
  }

  static int spaceCount(String st) {
    int count = 0;
    for(int i = 0; i < st.length(); i++) {
      if(st.charAt(i)==" ") {
        count++; 
      }
    }
    return count;
  }
}
