// class Account
// {
    // private int accNum =  12345;  // private memebers are not inherited 
     // private int pin = 9999;
//     int accNum =  12345;
//     int pin = 9999;

// }

// class Hacker extends Account // inheriting from the above class   
// {
//     void disp()
//     {
//         System.out.println(accNum);
//         System.out.println(pin);
//     }

//     void changeData()
//     {
//         accNum = 6789;
//         pin = 8888;
//     }
// }


// public class inheritance 
// {
//     public static void main(String[] args) {
//         Hacker h = new Hacker();
//         h.disp();
//         h.changeData();
//         h.disp();

//     }
// }



class i1
{
    void fun1()
    {
        System.out.println("inside fun1()");
    }
}

class ii1 extends i1
{
    void fun2()
    {
        System.out.println("inside fun2()");
    }
}

class iii1 extends ii1 
{
    void fun3() 
    {
        System.out.println("inside fun3()");
    }
}

public class inheritance 
{
    public static void main(String[] args) 
    {
        iii1 d3 = new iii1();
        d3.fun1();
        d3.fun2();
        d3.fun3();
    }
}
