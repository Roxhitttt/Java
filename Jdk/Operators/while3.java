import java.util.Scanner;
class while3
{
    public static void main(String args[])
    {
        int i=1;
        int j=1;
        while(i<=5)
        {
            j=1;
            while(j<=i)
            {
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}