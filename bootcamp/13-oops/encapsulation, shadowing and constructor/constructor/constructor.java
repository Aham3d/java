/*
 * it is a specialized, parameterzed setData
 * constructor have the same name as the className
 * they don't have return type
 * they are called during abject craetion
 */
public class constructor {
  
  public static void main(String[] args) {
    customer c = new customer(001, "moin", 989798798); 

    System.out.println(c.getcId() + " " + c.getcName() + " " + c.getcNumber());   
  }
  
}

class customer {
  private int cID; 
  private String cName; 
  private long cNumber; 

  public customer(int cID, String cName, long cNumber) {
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
// quick revise