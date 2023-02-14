// Find greater between 3 numbers using nested if else.

import java.util.Scanner;
class ifnestedifelse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number a:");
        a=sc.nextInt();
        System.out.println("Enter number b:");
        b=sc.nextInt();
        System.out.println("Enter number c:");
        c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("Number "+a+" is greater than Number "+b+" and Number "+c);
            }
            else
            {
                System.out.println("Number "+c+" is greater than Number "+a+" and Number "+b);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("Number "+b+" is greater than Number "+a+" and Number "+c);
            }
            else
            {
                System.out.println("Number "+c+" is greater than Number "+a+" and Number "+b);
            }
        }
    }
}