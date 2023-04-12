import java.util.Scanner;

class businessman 
{
    private float si;
    private float p; 
    private float t;
    static private float r; 
    static private int count;

    static 
    {
        r = 12.5f;
    }

    public static int getCount()
    {
        return count;
    }
    
    public void acceptInput()
    {
        Scanner scan  = new Scanner(System.in);
        System.out.println("enter the loan amount");
        p = scan.nextInt();
        System.out.println("enter the tenure");
        t = scan.nextInt();
    }

    public void calcinterest()
    {
        si = (p*t*r)/100;
    }

    public void disp()
    {
        System.out.println(si);
    }

    {
        count++;
    }
}


class demo1
{
    public static void main(String[] args) 
    {
        businessman b1 = new businessman();
        b1.acceptInput();
        b1.calcinterest();
        b1.disp();

        businessman b2 = new businessman();
        b2.acceptInput();
        b2.calcinterest();
        b2.disp();


        businessman b3 = new businessman();
        b3.acceptInput();
        b3.calcinterest();
        b3.disp();

        System.out.println(businessman.getCount());
    }

    


}

