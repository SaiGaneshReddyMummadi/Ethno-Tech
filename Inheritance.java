public class Inheritance
{
    public void hello()
    {
        System.out.println("Hello to inheritance");
    }
}
class ChildInheritance extends Inheritance{
    public void hi()
    {
        System.out.println("Hi");
    }
}
class Main
{
    public static void main(String args[])
    {
        ChildInheritance obj=new ChildInheritance();
        obj.hi();
    }
}