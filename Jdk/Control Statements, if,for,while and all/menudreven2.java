import java.util.Scanner;
class menudreven2
{
    void firstname()
    {
        Scanner sc=new Scanner(System.in);
        String fn;
        System.out.println("Enter your first name: ");
        fn=sc.next();
        System.out.println(fn);
    }
    void middlename()
    {
        Scanner sc=new Scanner(System.in);
        String mn;
        System.out.println("Enter your middle name: ");
        mn=sc.next();
        System.out.println(mn);

    }
    void lastname()
    {
        Scanner sc=new Scanner(System.in);
        String ln;
        System.out.println("Enter your last name: ");
        ln=sc.next();
        System.out.println(ln);

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        menudreven2 o=new menudreven2();
        int i;


        do{
            System.out.println("1. Enter your first name \n 2. Enter your middle name \n 3. Enter your last name \n 4. Exit");
            i=sc.nextInt();

            switch(i)
            {
                case 1: o.firstname();
                break;
                case 2: o.middlename();
                break;
                case 3: o.lastname();
                break;
            }
        }while(i!=4);
    }
}