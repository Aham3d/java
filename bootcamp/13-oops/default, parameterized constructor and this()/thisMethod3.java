// this() example 3
class customer4 {
  int Cid; 
  String Cname; 
  long Cnumber; 

  public customer4() {
    Cname = "name2"; 
  }  

  public customer4(int Cid) {
    this(); 
    this.Cid = Cid; 
  }

  public customer4(int Cid, String Cname, long cnNumber) {
    this(Cid); 
  }

  public int getCid() {
    return Cid; 
  }

  public String getCname() {
    return Cname; 
  }

  public long getCnumber() {
    return Cnumber; 
  }
}


public class thisMethod3 {
  
  public static void main(String[] args) {
    customer4 c = new customer4(101, "name1", 4398793847534L);

    System.out.println(c.getCid() + " " + c.getCname() + " " + c.getCnumber());
  }

}
