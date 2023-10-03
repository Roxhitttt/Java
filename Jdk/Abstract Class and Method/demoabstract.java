abstract class demo{
        int a,b;
        demo(int a, int b){
            this.a=a;
            this.b=b;
        }
        abstract void show();
}
class demo2 extends demo{
        int c;
        demo2(int a,int b, int c){
            super(a,b);
            this.c=c;
        }
        void show(){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }
}
public class demoabstract{
    public static void main(String args[]){
        demo2 o=new demo2(11,12,13);
        o.show();
    }
}