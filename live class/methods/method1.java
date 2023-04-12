// no input no output 

package methods;

public class method1  // method1 is a replace of addition 
{
    int a = 50; 
    int b = 40; 
    
    void add() // void means nothing, it doesn't give any output( return ).
    {

        int c = a + b; 
        System.out.println(c);
    }
}

class demo 
{
    public static void main(String[] args) {
        method1 calc = new method1();
        calc.add();
    }
}