/*
 * the process of preventing direct acces to the most important component of an object
 * 
 * it is not preventing access - it is providing controlled access
 */


// encapsulation and shodowing problem and constructor //
public class encapsulation1 {
  
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(); 

    ba.setData(1000);

    System.out.println(ba.getData());
  }

}

class BankAccount {
  private long balance; 

  public void setData(long amt) {
    if(amt >= 0) {
      balance = amt;
    } else {
      System.out.println("invalid amount");
    }
  }

  public long getData() {
    return balance;
  }

}
// quick revise