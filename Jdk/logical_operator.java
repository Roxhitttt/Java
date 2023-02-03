import java.util.Scanner;  /* Import the Scanner class */ /* This is used to take input from the user like we use scanf in C programming language */
class logical_operator
{
    public static void main(String args[]){

        int a;
        String s;
        Scanner sc=new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a");
        a=sc.nextInt(); // Read user input
        System.out.println("a="+a); // Output user input

        System.out.println("Enter String");
        s=sc.next();
        System.out.println("String "+s);

        System.out.println("Enter Float");
        float c=sc.nextFloat();
        System.out.println("Float is ="+c);

        System.out.println("Enter double");
        double d=sc.nextDouble();
        System.out.println("double is ="+d);

        System.out.println("Enter Long");
        long l=sc.nextLong();
        System.out.println("Long ="+l);
    }
}