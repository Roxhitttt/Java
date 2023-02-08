import java.util.Scanner;
class logicaloperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ");
        int a=sc.nextInt();
        System.out.println("Enter b ");
        int b=sc.nextInt();
        System.out.println("Enter c ");
        int c=sc.nextInt();
        System.out.println("Enter d ");
        int d=sc.nextInt();

        boolean r=(a>b)&&(c>d);
        System.out.println("And first condition   "+r);

        r=(a<b)&&(c<d);
        System.out.println("And 2 condition   "+r);

        r=(a<b)&&(c>d);
        System.out.println("And 3 condition   "+r);

        r=(a>b)&&(c<d);
        System.out.println("And 4 condition   "+r);

        r=(a>b)||(c>d);
        System.out.println("Or first condition   "+r);

        r=(a<b)||(c<d);
        System.out.println("Or 2 condition   "+r);

        r=(a<b)||(c>d);
        System.out.println("Or 3 condition   "+r);

        r=(a>b)||(c<d);
        System.out.println("Or 4 condition   "+r);

        r=!((a<b)||(c<d));
        System.out.println("Not Result is   "+r);

    }
}