import java.util.Scanner;
public class ElectricBill 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int units = sc.nextInt();
        System.out.println("Electricty bill " + eleBill(units));
    }
    static int eleBill(int units)
    {
        return ((units > 250) & true) ? units - 250 : 0;
    }
}
