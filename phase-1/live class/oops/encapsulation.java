//3/11

class BankAccount
{
    private int balance;

    public void setData(int x)
    {
        if(x >= 0)
        {
            balance = x;
        }
        else
        {
            System.out.println("invalid input");
            System.exit(0);
        }
    }

    public int getData()
    {
        return balance;
    }
}



public class encapsulation 
{
    public static void main(String[] args) 
    {
        BankAccount ba = new BankAccount();     
        // ba.balance = 100000;
        // System.out.println(ba.balance);
        ba.setData(100000);
        System.out.println(ba.getData());
    }
}
