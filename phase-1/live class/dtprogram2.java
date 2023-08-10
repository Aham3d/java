public class dtprogram2 {
    public static void main(String[] args)
    {
        int n1 = 90;
        int n2 = 60;
        int n3 = 45;

        if(n1==60 && n2 == 60 && n3 == 60)
        {
            System.out.println("prize 3");
        }
        else if(n1+n2+n3 == 180 && (n1==90 || n2==90 || n3 == 90))
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
