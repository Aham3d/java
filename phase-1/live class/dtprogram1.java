public class dtprogram1
{
    public static void main(String[] args) {
        double n1 = 15888;
        double n2 = 1999;
        double n3 = 299;
        double n4 = 159;

        double d1 = n1*7/100 + n2*3/100 + n3*2/100 + n4*1/100;

        double sum = n1+n2+n3+n4;

        double d2 = 0;

        if(sum >= 25000 && sum <= 50000) 
        {
            d2=sum*5/100;
        }
        else if(sum >= 50001 && sum <= 100000)
        {
            d2 = sum*7/100;
        }
        else if(sum>=100001)
        {
            d2 = sum*10/100;
        }

        if(d1 > d2)
        {
            System.out.println(d1);
        }
        else 
        {
            System.out.println(d2);
        }
    }
}

