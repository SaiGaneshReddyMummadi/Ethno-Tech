class Employee {
    public void name(String name,int id)
    {
        System.out.println(name+" "+id);
    }
    public static void main(String args[])
    {
        Employee obj=new Employee();
        obj.name("ganesh",1);
        Role rol=new Role();
        rol.developer();
        rol.manager();
        Salary sal=new Salary();
        sal.salary(1000000000);
        System.out.println();
        obj.name("dinesh",2);
        rol.tester();
        sal.salary(10000);
    }
}
class Role extends Employee{
    public void tester()
    {
        System.out.println("Hi im a tester");
    }
    public void developer()
    {
        System.out.println("mai developer huuu..");
    }
    public void manager()
    {
        System.out.println("DHURANDHAR...");
    }
} 
class Salary
{
    public void salary(int sal)
    {
        System.out.println(sal+" per day");
    }
}
// class Main
// {
//     public static void main(String args[])
//     {
//         Employee obj=new Employee();
//         obj.name("ganesh",1);
//         Role rol=new Role();
//         rol.developer();
//         rol.manager();
//         Salary sal=new Salary();
//         sal.salary(1000000000);
//     }
// }
