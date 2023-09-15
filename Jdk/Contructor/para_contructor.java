import java.util.*;
class para_contructor{
    int length;
    int breadth;
    para_contructor(int l,int b){
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
          
        para_contructor o=new para_contructor(len,brt);
        o.show();
        sc.close();
    }
}
