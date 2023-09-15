import java.util.*;
class defaultconct{
    int length;
    int breadth;
    defaultconct(int l,int b){
        length = l;
        breadth = b;
    }
    void show(){
        int Aor = length * breadth;
        System.out.println("Area of rectangle is : " + Aor);
    }
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int len,brt;
          System.out.println("Enter length");
          len=sc.nextInt();
          System.out.println("Enter breadth");
          brt=sc.nextInt();
          
        defaultconct o=new defaultconct(len,brt);
        o.show();
        sc.close();
    }
}
