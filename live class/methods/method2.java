// no input but output  

package methods;

public class method2 
{
    int a = 50; 
    int b = 40; 
    
    int add() 
    {
        int c = a + b; 
        return c; 
    }
}

class demo 
{
    public static void main(String[] args) 
    {
        method2 calc = new method2(); 
        int res = calc.add();
        System.out.println(res);
    }
    
}
