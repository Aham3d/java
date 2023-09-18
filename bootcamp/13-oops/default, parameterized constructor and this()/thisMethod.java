// this() example 1
class customer2 {
  
  private int cId;
  private String cName; 
  private long cNumber; 
  
  public customer2() {
    cId = 102; 
    cName = "name2"; 
    cNumber = 4987434344L;
  }

  public customer2(int cId, String cName, long cNumber) {
    this(); 
  }

  public int getCid() {
    return cId; 
  }

  public String getCname() {
    return cName; 
  }

  public long getNumber() {
    return cNumber; 
  }

}

public class thisMethod {

  public static void main(String[] args) {
    customer2 c = new customer2(101, "name1", 398479857349L); 

    System.out.println(c.getCid() + " " + c.getCname() + " " + c.getNumber());
  }

}