import java.util.*;
class First{
    int a;
    First(int aa){
        a=aa;
    }
    void show1(){
        System.out.println("Value of a is : " + a);
    }
}
class Second extends First{
    int b;
    Second(int aa, int bb){
        super(aa);
        b=bb;
    }
    void show2(){
        System.out.println("Value of b is : " + b);
    }
}
class Third extends Second{
    int c;
    Third(int aa,int bb,int cc){
        super(aa, bb);
        c=cc;
    }
    void show3(){
        System.out.println("Value of c is : " + c);
    }
    void maximun(){
        if(a > b && a > c){
            System.out.println("a is greater than b and c");
        }
        if(b > c && b > a){
            System.out.println("b is greater than a and c");
        }
        else{
            System.out.println("c is greater than a and b");
        }
    }
}
public class multi_level {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int vala=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int valb=sc.nextInt();
        System.out.println("Enter the value of c : ");
        int valc=sc.nextInt();

        Third o=new Third(vala,valb,valc);
        o.show1();
        o.show2();
        o.show3();
        o.maximun();
    }
}
