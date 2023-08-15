class refCar {
    String name; 
    int cost;
}

public class referenceTypeAssignment {
 
  public static void main(String[] args) {
    refCar x = new refCar(); 

    x.name = "name1"; 
    x.cost = 50000;

    System.out.println(x.name);
    System.out.println(x.cost);

    refCar y; 
    y = x; 

    System.out.println(y.name);
    System.out.println(y.cost);

    y.name = "name2"; 
    y.cost = 60000; 

    System.out.println(x.name);
    System.out.println(x.cost);

  }
}

