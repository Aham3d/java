public class overloading {
    
  public static void main(String[] args) {
    
    customer c1 = new customer(); 

    c1.gender = 'm'; 
    c1.city = "bangalore";
    c1.cID = 1234; 
    c1.mobile = 888888888; 

    System.out.println(c1.gender);
    System.out.println(c1.city);
    System.out.println(c1.cID);
    System.out.println(c1.mobile);

    c1.setDetail('f');
    c1.setDetail("mysore");
    c1.setDetail(5678);
    c1.setDetail(999999999);

    System.out.println(c1.gender);
    System.out.println(c1.city);
    System.out.println(c1.cID);
    System.out.println(c1.mobile);
    
  }

}

class customer {  
  char gender; 
  String city; 
  int cID; 
  long mobile; 

  void setDetail(char g) {
    gender = g; 
  }

  void setDetail(String c) {
    city = c; 
  }

  void setDetail(int i) {
    cID = i; 
  }

  void setDetail(long m) {
    mobile = m; 
  }
}