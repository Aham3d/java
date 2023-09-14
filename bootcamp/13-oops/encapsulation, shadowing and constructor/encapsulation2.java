public class encapsulation2 {
  public static void main(String[] args) {
    customer c = new customer(); 

    

    c.setData(001, "moin", 855987987);

    System.out.println(c.getcId() + " " + c.getCname() + " " + c.getCnumber());
  }
}

class customer {
  private int cID; 
  private String cName; 
  private long cNumber; 

  public void setData(int cID, String cName, long cNumber) {
    this.cID = cID; 
    this.cName = cName;
    this.cNumber = cNumber; 
  }

  public int getcId() {
    return cID; 
  }

  public String getcName() {
    return cName; 
  }

  public long getcNumber() {
    return cNumber; 
  }
}
