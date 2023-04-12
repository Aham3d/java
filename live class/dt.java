

public class dt
 {

    public static void main(String[] args)
    {
        byte a = -128;
        short b = 32767;
        int c = -2147483648;
        long l = -922337236845775808L;
        
        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);      
    }

    

}
// min and max that can be stored in byte data types in -128 to +127 ( -2^n-1 to 2^n-1 -1 [ n = 8 ])
// min and max that can be stored in short data type is -32768 to 32767 ( -2^n-1 to 2^n-1 -1 [ n = 16 ])
// min and max that can be stored in int data types in -2147483658 to +2147483657 ( -2^n-1 to 2^n-1 -1 [ n = 32 ])
// min and max that can be stored in long data types in -922337236845775808 to +922337236845775808 ( -2^n-1 to 2^n-1 -1 [ n = 64 ])
