class instance {
  String type = "car";
  String name = "xyz";
  int cost = 200000;

  public static void main(String[] args) {
    instance example1 = new instance(); 
    System.out.println(example1.type);
    System.out.println(example1.name);
    System.out.println(example1.cost);
  }
}

/*
  
  -instance variables are variables which are inside a class

  from the memory point of view
  - jvm allocates memory of the instance variables inside HEAP segment, when we create or call it new instance() - line7 
  - it's created with the default data type values 
  - the defualt value get over-written by the actuale values
  - the left side of the code - instance example1 - allocates in the STACK segment, which refers to the HEAP segment with the same address
  

  

 */