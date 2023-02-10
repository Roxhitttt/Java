import java.util.Scanner;
class ternaryoperator
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        c=(a>b)?a:b;
        System.out.println("Greater is "+c);
    }
}