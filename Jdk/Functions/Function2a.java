/* Method with argument but without return value, This type of method does not return any value but it accepts arguments */

import java.util.Scanner;
class Function2
{
    void mul(int a,int b)
    {
        int c;
        c=a*b;
        System.out.println(a+"X"+b+"="+c);
    }

    public static void main(String args[])
    {
        int l,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no:");
        l=sc.nextInt();
        System.out.println("Enter second no:");
        m=sc.nextInt();

        Function2 o=new Function2();
        o.mul(l,m);
    }
}