public class arrays4 {
    // disadvantages of array 

    // and program on hurdle race
    public static void main(int k, int[] a) {
        int max = 0; 
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        if(k >= max)
        {
            return 0; 
        }
        else
        {
            return mx - k;  
        }
    }
}
