import java.util.Scanner;
class task1{
    public static void main(String args[]){

        int a,b,c;
        float d,e,f;
        String s,v,w;
        double g,h,i;
        long j,k,l;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a");
        System.out.println("Enter the value of b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
        c=a+b;
        System.out.println(+a+"+"+b+"="+c);

        System.out.println("Enter the value of d");
        System.out.println("Enter the value of e");
        d=sc.nextFloat();
        e=sc.nextFloat();
        System.out.println("d="+d);
        System.out.println("e="+e);
        f=d-e;
        System.out.println(+d+"-"+e+"="+f);

        System.out.println("Enter String 1");
        System.out.println("Enter String 2");
        s=sc.next();
        v=sc.next();
        System.out.println("s="+s);
        System.out.println("v="+v);
        w=s+v;
        System.out.println(s+"+"+v+"="+w);

    }
}