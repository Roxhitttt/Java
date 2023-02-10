/* Method with argument but without return value  */ 

import java.util.Scanner;
class Function3
{
    void cal(int a,int b, int c,int d)
    {
        int total=a+b+c+d;
        float per = (total * 100) / 400; 
        System.out.println("Total marks Obtained by the Student : "+total);
        System.out.println("Percentage Obtained by the Student : "+per);

        /* percentage = (total / 500) * 100.  */
    }
    public static void main(String args[])
    {
        int l,m,n,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Physics: ");
        l=sc.nextInt();
        System.out.println("Enter the marks of Chemistry: ");
        m=sc.nextInt();
        System.out.println("Enter the marks of Maths: ");
        n=sc.nextInt();
        System.out.println("Enter the marks of Geography: ");
        z=sc.nextInt();

        Function3 o=new Function3();
        o.cal(l,m,n,z);
    }
}