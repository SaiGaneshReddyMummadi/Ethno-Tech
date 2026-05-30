abstract class FoodOrder
{
    public abstract void foodOrder(String cust,String name,int quant);
}
class Order extends FoodOrder{
    public void foodOrder(String cust,String name,int quant)
    {
        System.out.println(cust+" has ordered "+name+" in "+quant+" quantity.");
    }
}
public class Abstraction {
    public static void main(String args[])
    {
        Order obj=new Order();
        obj.foodOrder("Ganesh","Burgers", 2);
        obj.foodOrder("Sai Ganesh","Pizza", 1);
    }
}
