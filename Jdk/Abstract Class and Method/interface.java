interface first{
    void get();
    void area();
}
class circle implements first{
    int r;
    final float pi=3.14f;
    double ar;
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius : ");
        r=sc.nextInt();
    }
    public void area(){
        ar=pi*r;
        System.out.println("Area of circle is " + ar);
    }
}
class rectangle implements first{
    int l,b,ar;
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length : ");
        l=sc.nextInt();
        System.out.println("Enter breadth : ");
        b=sc.nextInt();
    }
    public void area(){
        ar=l*b;
        System.out.println("Area fo a rectangle is : " + ar);
    }
}

public class interface {
    public static void main(String args[]){
        circle o=new circle();
        o.get();
        o.show();

        rectangle or.new rectangle();
        or.get();
        or.show();
    }
}
