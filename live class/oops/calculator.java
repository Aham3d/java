public class calculator 
{
     
    int add(int x, int y)    // removed the numbers after the word add(metthod) 
    {                        //  creating multiple methods(add) of the same name in a class(calculator) is called method overloading( also called virtual polymorphism(1:M))
        return x+y;
    }
    float add(float x, float y)
    {
        return x+y;
    }
    float add(int x, float y)
    {
        return x+y;
    }
    double add(double x, double y)
    {
        return x+y;
    }
    float add(float x, int y)
    {
        return x+y;
    }
    double add(double x, double y, double z)
    {
        return x+y+z;
    }
    double add( int x, float y, double z)
    {
        return x+y+z;
    }
    float add( float x, float y, float z)
    {
        return x+y+z;
    }
    int add( int x, int y, int z)
    {
        return x+y+z;
    }
    float add( float x, int y, int z)
    {
        return x+y+z;
    }
    
}

class calci 
{
    public static void main(String[] args) 
    {
        int a = 10, b = 20, c = 30; 
        float m = 10.5f, n = 20.5f, o = 30.5f;
        double p = 100.5, q = 200.5, r = 300.5;

        calculator calc = new calculator();


        // System.out.println(calc.add1(a,b));   // used before removing the numbers after the letter add
        // System.out.println(calc.add4(p,q));
        // System.out.println(calc.add7(a, m, p));


        /* how the this works
            * no of parameters(ex-m,n) 
            * data types of the parameters(ex-float, float) 
            * order of the data types (in case of same data type) 
        */ 
        System.out.println(calc.add(m,n));  
        System.out.println(calc.add(p,q));
        System.out.println(calc.add(a,m,p));
        System.out.println(calc.add(a,m));



    }
}
