package variables;
import java.util.Scanner;

// instance variables (it'll be inside the class not inside the main method)

// public class dog         
// {
//     String name;
//     String breed;
//     int cost;

// }

// class demo
// {
//     public static void main(String[] args) 
//     {
//        dog d = new dog();
//        System.out.println(d.name);    
//        System.out.println(d.breed);
//        System.out.println(d.cost);

//        d.name = "scooby";
//        d.breed = "pug";
//        d.cost = 10000;

//        System.out.println(d.name);
//        System.out.println(d.breed);
//        System.out.println(d.cost);
//     }
// }


// local variables 

// class dog
// {
//     public static void main(String[] args) {
//         int a = 99; 
//         float b = 99.99f;
//         boolean c = true; 
//         double d = 100.99;

//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }

// value type assignment 

// class dog
// {
//     public static void main(String[] args) {
        
//         int a = 1000; 
//         System.out.println(a);

//         int b; 
//         b = a;
//         System.out.println(b);

//         b = 2000; 
//         System.out.println(b);
//         System.out.println(a);
//     }
// }

//  reference type assignment

class dog //dog = car 
{
    String name;
    float mileage; 
    int cost;
}

class demo
{
    public static void main(String[] args) 
    {
        dog a = new dog(); // dog = car 
        a.name = "BMW";
        a.mileage = 5.5f;
        a.cost = 75; 
        System.out.println(a.name);
        System.out.println(a.mileage);
        System.out.println(a.cost);

        dog b; // dog = car
        b = a; 
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        b.name = "tata";
        b.mileage = 15.8f;
        b.cost = 13;  
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        System.out.println(a.name);
        System.out.println(a.mileage);
        System.out.println(a.cost);





    }
}