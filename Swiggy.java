class MenuItem
{
    private String itemName;
    private int price;
    public MenuItem(String itemName,int price)
    {
        this.itemName=itemName;
        this.price=price;
    }
    public String getItemName()
    {
        return itemName;
    }
    public int getPrice()
    {
        return price;
    }
}
class User
{
    private int id;
    private String name;
    public User(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
class Customer extends User
{
    public Customer(int id,String name)
    {
        super(id,name);
    }
}
interface Bill
{
    int calculateBill();
}
class Cart implements Bill
{
    MenuItem items[]=new MenuItem[10];
    int count=0;
    public void addItem(MenuItem item)
    {
        items[count++]=item;
    }
    public void showCart()
    {
        System.out.println("\nITEMS IN CART");
        for(int i=0;i<count;i++)
        {
            System.out.println(items[i].getItemName()+" - "+items[i].getPrice());
        }
    }
    public int calculateBill()
    {
        int total=0;
        for(int i=0;i<count;i++)
        {
            total+=items[i].getPrice();
        }
        return total;
    }
}
abstract class Order
{
    int orderId;
    public Order(int orderId)
    {
        this.orderId=orderId;
    }
    public abstract void showStatus();
}
class FoodOrder extends Order
{
    public FoodOrder(int orderId)
    {
        super(orderId);
    }
    public void showStatus()
    {
        System.out.println("\nOrder "+orderId+" placed successfully");
    }
}
public class Swiggy
{
    public static void main(String args[])
    {
        Customer obj=new Customer(101,"Ganesh");
        MenuItem item1=new MenuItem("Chicken Biryani",250);
        MenuItem item2=new MenuItem("Mutton Biryani",350);
        MenuItem item3=new MenuItem("Veg Biryani",180);
        MenuItem item4=new MenuItem("Pizza",300);
        MenuItem item5=new MenuItem("Burger",120);
        MenuItem item6=new MenuItem("French Fries",90);
        MenuItem item7=new MenuItem("Coke",40);
        MenuItem item8=new MenuItem("Ice Cream",60);
        MenuItem item9=new MenuItem("Shawarma",150);
        MenuItem item10=new MenuItem("Fried Rice",170);
        System.out.println("MENU");
        System.out.println("1. "+item1.getItemName()+" - "+item1.getPrice());
        System.out.println("2. "+item2.getItemName()+" - "+item2.getPrice());
        System.out.println("3. "+item3.getItemName()+" - "+item3.getPrice());
        System.out.println("4. "+item4.getItemName()+" - "+item4.getPrice());
        System.out.println("5. "+item5.getItemName()+" - "+item5.getPrice());
        System.out.println("6. "+item6.getItemName()+" - "+item6.getPrice());
        System.out.println("7. "+item7.getItemName()+" - "+item7.getPrice());
        System.out.println("8. "+item8.getItemName()+" - "+item8.getPrice());
        System.out.println("9. "+item9.getItemName()+" - "+item9.getPrice());
        System.out.println("10. "+item10.getItemName()+" - "+item10.getPrice());
        Cart cart=new Cart();
        cart.addItem(item1);
        cart.addItem(item4);
        cart.addItem(item7);
        cart.addItem(item8);
        cart.addItem(item10);
        cart.showCart();
        Bill bill=cart;
        System.out.println("\nTotal Bill: "+bill.calculateBill());
        Order order=new FoodOrder(5001);
        order.showStatus();
        System.out.println("Thank You "+obj.getName()+" for ordering");
    }
}