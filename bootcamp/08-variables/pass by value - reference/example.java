class exampleCar {
  String name; 
  int cost; 

  void modifyCar(exampleCar y) {
    y.name = "name2";
    y.cost = 2; 
  }
}

public class example {
  public static void main(String[] args) {
    exampleCar x = new exampleCar(); 
    x.name = "name1"; 
    x.cost = 1;

    System.out.println(x.name);
    System.out.println(x.cost);

    x.modifyCar(x);

    System.out.println(x.name);
    System.out.println(x.cost);
  }  
}
