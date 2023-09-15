/* Function with argument with return value: In this type of method, method with argument with return value, method going to take the arguments also method will return the value */
import java.util.Scanner;
class Function4{

    int area(int l, int b)
    {
        int a=l*b;
        return a;
    }

    public static void main(String args[])
    {
        int len,bre;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:");
        len=sc.nextInt();
        System.out.println("Enter Breadth:");
        bre=sc.nextInt();

        Function4 o=new Function4();
        int r=o.area(len,bre);
        System.out.println("Area of Rectangle is "+r); 
    }
}