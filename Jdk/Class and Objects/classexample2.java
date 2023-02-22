import java.util.Scanner;
class student
{
    int id;
    String name;
    int phy,chem,math,geog;
    int total;
    int percentage;

    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your id: ");
        id=sc.nextInt();
        System.out.print("Enter your name: ");
        name=sc.next();
        System.out.println();
        System.out.print("Enter marks of physics: ");
        phy=sc.nextInt();
        System.out.print("Enter marks of chemistry: ");
        chem=sc.nextInt();
        System.out.print("Enter marks of maths: ");
        math=sc.nextInt();
        System.out.print("Enter marks of geography: ");
        geog=sc.nextInt();
        System.out.println();

    }
    void show()
    {
        System.out.println("Id                               :"+id);
        System.out.println("Name                             :"+name);
        System.out.println();
        System.out.println("Physics                          :"+phy);
        System.out.println("Chemistry                        :"+chem);
        System.out.println("Maths                            :"+math);
        System.out.println("Geography                        :"+geog);
        System.out.println();
        total=phy+chem+math+geog;
        System.out.println("Total marks of all the Subjects  :"+total);
        System.out.println();
        percentage=(total*100)/400;
        System.out.println("You got "+percentage+" percentage");
        System.out.println();
    }
}
class classexample2
{
    public static void main(String args[])
    {
        student o=new student();

        o.get();
        o.show();

        student o2=new student();

        o2.id=2;
        o2.name="Vishal";
        o2.phy=88;
        o2.chem=74;
        o2.math=98;
        o2.geog=79;
        o2.show();
    }
}