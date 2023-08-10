// discount calculator 

import java.util.Scanner;

class   firstpclass 
{
    public static void main(String[] args) 
    {

        // discount calculator
        // int n1 = 15888;
        // int n2 = 1999;
        // int n3 = 299;
        // int n4 = 15;

        // double d1 = n1*7.0/100 + n2*3.0/100 + n3*2.0/100 + n4*1.0/100; 

        // int sum = n1 + n2 + n3 + n4;

        // double d2 = 0;

        // if(sum >= 25001 && sum <= 50000)
        // {
        //     d2 = sum*5/100;
        // }
        // else if(sum >= 50001 && sum <= 100000)
        // {
        //     d2 = sum*7/100;
        // }
        // else if(sum >= 100001)
        // {
        //     d2 = sum*10/100;
        // }

        // if(d1 > d2)
        // {
        //     System.out.println(d1);
        // }
        // else 
        // {
        //     System.out.println(d2);
        // }
        //


        // triangle game
        int n1= 60; 
        int n2= 60; 
        int n3= 60; 

        if(n1 == 60 && n2 == 60 && n3 == 60)
        {
            System.out.println("prize 3 ");
        }
        else if( n1+n2+n3 == 180 && (n1 == 90 || n2 == 90 || n3 == 90))
        {
            System.out.println("prize 2");
        }
        else if(n1+n2+n3 == 180)
        {
            System.out.println("prize 1");
        }
        else 
        {
            System.out.println("no prize");
        }


    }
}