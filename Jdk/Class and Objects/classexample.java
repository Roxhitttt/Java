import java.util.Scanner;
class employee
{
    int id;
    String name;
    int salary;
    String department;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id: ");
        id=sc.nextInt();
        System.out.println("Enter your name: ");
        name=sc.next();
        System.out.println("Enter your salary: ");
        salary=sc.nextInt();
        System.out.println("Enter your department: ");
        department=sc.next();
        System.out.println();

    }
    void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("id            :"+id);
        System.out.println("name          :"+name);
        System.out.println("salary        :"+salary);
        System.out.println("department    :"+department);
        System.out.println();

    }
}
class classexample
{
    public static void main(String args[])
    {
        employee o=new employee();

        o.get();
        o.show();

        employee o2=new employee();
        o2.id=2;
        o2.name="Vishal";
        o2.salary=8000;
        o2.department="Computer";
        o2.show();

    }
}