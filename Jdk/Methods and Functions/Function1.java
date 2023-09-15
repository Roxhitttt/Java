/* Function without argument without return value */
import java.util.Scanner;
class Function1
{
    void show() /* Function is called as Method */
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextInt();
        System.out.println("Enter b");
        b=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String args[])
    {
        Function1 o=new Function1();
        o.show();
    }
}