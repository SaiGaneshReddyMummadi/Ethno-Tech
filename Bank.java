class BankInfo
{
    int acc;
    String name;
    public BankInfo(int acc,String name)
    {
        this.acc=acc;
        this.name=name;
    }
    public void showInfo()
    {
        System.out.println("ACCOUNT NUMBER: "+acc);
        System.out.println("Name: "+name);
    }
}
class Operations extends BankInfo
{
    int total;
    public Operations(int acc,String name)
    {
        super(acc,name);
    }
    public void deposit(int acc,int money)
    {
        total+=money;
        System.out.println(money+" amount depsoited to the bank account");
        super.showInfo();
        System.out.println("Total balance available: "+total);
    }
    public void withdraw(int acc,int money)
    {
        total-=money;
        System.out.println(money+" amount withdrawn from the bank account");
        super.showInfo();
        System.out.println("Total balance available: "+total);
    }
    public void chackBalance(int id)
    {
        System.out.println("Total balance available: "+total);
    }
}
public class Bank{
    public static void main(String args[])
    {
        Operations obj=new Operations(1,"Ganesh");
        obj.deposit(1,1000);
        obj.withdraw(1,200);
        obj.deposit(1,1000);
        obj.chackBalance(1);
        System.out.println();
        Operations ob=new Operations(2,"Dinesh");
        ob.deposit(2,500);
        ob.withdraw(2,20);
        ob.deposit(2,500);
        ob.chackBalance(2);
    }
}
