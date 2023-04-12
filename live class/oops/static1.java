class test 
{
    static int a,b;  // static variables 
    static // static block 
    {
        System.out.println("Inside static block");
        a = 100; 
        b = 200; 
    }
    
    static void fun1() // static method
    {
        System.out.println("Inside static method fun 1");
    }

    int x,y; // instance variables

    {  // instance block 
        System.out.println("Inside instance block");
    }

    void fun2() // instance method 
    {
        System.out.println("Inside instance method fun2");
    }

    public test()
    {
        System.out.println("Inside constructors");
        x = 300; 
        y = 400; 

    }

}

class demo 
{
    public static void main(String[] args) {
        
        test.fun1();  //calling fun1(it belongs to the class) which is static method
        test t = new test();  // calling fun2 ( it doesn't belongs to the class it belongs to the obejct) instance variables 
        t.fun2();
    }
}
