public class contructor_overloading {
    int a,b;
    contructor_overloading(){
        a=7;
        b=7;
    }
    contructor_overloading(int l,int m){
        a = l;
        b = m;
    }
    void show(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String args[]){
        contructor_overloading o = new contructor_overloading();
        contructor_overloading o1 = new contructor_overloading(6,7);
        o.show();
        o1.show();
    }
}
