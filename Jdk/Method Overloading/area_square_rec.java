import java.util.*;
class square{
    int length;
    square(int len){
        length=len;
    }
    void area(){
        int a=length*length;
        System.out.println("Area of square is : " + a);
    }
}
class rectanglee extends square{
    int breadth;
    rectanglee(int len,int bred){
        super(len);
        breadth=bred;
    }
    void area(){
        int aa=length*breadth;
        super.area();
        System.out.println("Area of rectangle is : " + aa);
    }
}
public class area_square_rec {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length : ");
        int len=sc.nextInt();
        System.out.println("Enter Breadth : ");
        int bred=sc.nextInt();
    rectanglee o=new rectanglee(len,bred);
        o.area();
    }
}
