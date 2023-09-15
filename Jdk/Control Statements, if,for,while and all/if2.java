// check wether given num is positive no or negative no.

import java.util.Scanner;
class if2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a:");
        a=sc.nextInt();

        if(a>0)
        {
            System.out.println("Number is Positive");
        }
        if(a<0)
        {
            System.out.println("Number is Negative");
        }
    }
}