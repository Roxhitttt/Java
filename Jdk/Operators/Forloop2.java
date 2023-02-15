import java.util.Scanner;
class Forloop2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,l=1;
        System.out.println("Enter the number of Factorial you want: ");
        a=sc.nextInt();
        int i;
        for(i=1; i<=a; i++)
        {
            l=l*i;
        }
        System.out.println(l);
        

    }
}