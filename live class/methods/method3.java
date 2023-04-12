// input but no output

package methods;

public class method3 

    {
        int c;
        
        void  add(int a,int b)
        {
            c = a + b;
            System.out.println(c);
        }
    }
    
    class demo 
    {
        public static void main(String[] args) 
        {
            method3 calc = new method3(); 
            int num1 = 50; 
            int num2 = 40; 

            calc.add(num1, num2);

        }
        
    }
    

