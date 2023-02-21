import java.util.Scanner;
class menudreven
{
    void Addition()
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number a: ");
        a=sc.nextInt();
        System.out.print("Enter Number b: ");
        b=sc.nextInt();
        int add=a+b;
        System.out.println("Addition a + b = "+add);
    }
    void Substraction()
    {
        int c;
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number c: ");
        c=sc.nextInt();
        System.out.print("Enter Number d: ");
        d=sc.nextInt();
        int sub=c-d;
        System.out.println("Substraction c - d = "+sub);
    }
    void Multiplication()
    {
        int e;
        int f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number e: ");
        e=sc.nextInt();
        System.out.print("Enter Number f: ");
        f=sc.nextInt();
        int mul=e*f;
        System.out.println("Multiplication e * f = "+mul);
    }
    void Division()
    {
        int g;
        int h;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number g: ");
        g=sc.nextInt();
        System.out.print("Enter Number h: ");
        h=sc.nextInt();
        int div=g/h;
        System.out.println("Division g / h = "+div);
    }
    

    public static void main(String args[])
    {
        menudreven o=new menudreven();

        int i;

       do{    
        Scanner sc=new Scanner(System.in);
        System.out.println("1. addition \n2. substraction \n3. multiplication \n4. Division \n5. Exit \nEnter your choice: ");
        i=sc.nextInt();   

       switch(i) 
       {
            case 1:
                o.Addition();
                break;
            case 2:
                o.Substraction();
                break;
            case 3:
                o.Multiplication();
                break;
            case 4:
                o.Division();
                break;
            
        }
       
       }while(i!=5);

    }
}