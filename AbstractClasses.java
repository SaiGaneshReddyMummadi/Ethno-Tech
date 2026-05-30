abstract class Election
{
    public abstract void conductElection();
}
class LokSabhaElection extends Election
{
    @Override
    public void conductElection()
    {
        System.out.println("Conducting Lok Sabha Elections");
    }
}
class AssemblyElection extends Election
{
    @Override
    public void conductElection()
    {
        System.out.println("Conducting State Assembly Elections");
    }
}
public class AbstractClasses
{
    public static void main(String args[])
    {
        Election obj1=new LokSabhaElection();
        obj1.conductElection();
        Election obj2=new AssemblyElection();
        obj2.conductElection();
    }
}