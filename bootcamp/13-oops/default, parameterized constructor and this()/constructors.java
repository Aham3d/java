/*
  * default constructor is a constructor which java automatically provides to a class if not a single constructor is found.
  * zero parameterized constructor
  * constructor overloading
  */
class customer {

  private int cId; 
  private String cName; 
  private long cNumber; 

  public customer() { // zero paramterized constructor
    cId = 2; 
    cName = "name2"; 
    cNumber = 287409879; 
  }

  public customer(int cId, String cName, long cNumber) { // constructor overloading
    this.cId = cId; 
    this.cName = cName; 
    this.cNumber = cNumber; 
  }

  public int getCid() {
    return cId; 
  }

  public String getCname() {
    return cName; 
  }

  public long getCnumber() {
    return cNumber; 
  }

}

public class constructors {

  public static void main(String[] args) {
    
    customer c1 = new customer();   
    System.out.println(c1.getCid() + " " + c1.getCname() + " " + c1.getCnumber());

    customer c2 = new customer(1, "name1", 239074092); 
    System.out.println(c2.getCid() + " " + c2.getCname() + " " + c2.getCnumber());
    
  }

}
