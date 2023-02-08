import java.util.Scanner;
class logicaloperatorproject
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your username: ");
        int username=sc.nextInt();
        System.out.println("Enter your password: ");
        int password=sc.nextInt();

        if ((username==1234)&&(password==9876)){
        System.out.println("Login successful");
        }
        if ((username!=1234)&&(password!=9876)){
        System.out.println("Credentials are wrong");
        }
        if ((username!=1234)&&(password==9876)){
        System.out.println("Username is incorrect");
        }
        if ((username==1234)&&(password!=9876)){
        System.out.println("Password is incorrect");
        }
    }
}