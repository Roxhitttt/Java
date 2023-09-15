import java.util.Scanner;
class Function5
{
    float show()
    {
        int a;
        float d=0f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        a=sc.nextInt();
        if(a>3000&&a<5000)
        {
            d=3.0f;
        }
        if(a>5000&&a<100000)
        {
            d=4.0f;
        }
        if(a>10000&&a<15000)
        {
            d=5.0f;
        }
        return(d);
    }

    public static void main(String args[])
    {
        Function5 o=new Function5();
        float r=o.show();
        System.out.println("r="+r);
    }
}