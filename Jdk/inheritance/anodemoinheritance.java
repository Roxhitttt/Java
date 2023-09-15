
import java.util.Scanner;
class first{
    int integer1;
    void get_integer1(int i1){
        integer1=i1;
    }
    void square(){
        double s=integer1*integer1;
        System.out.println("Square of an integer is : " + s);
    }
    void cube(){
        double c=integer1*integer1*integer1;
        System.out.println("Cube of an integer is : " + c);
    }
}
class another extends first{
    int integer2;
    void get_integer2(int i2){
        integer2=i2;
    } 
    void maximum(){
        if(integer2 > integer1 ){
            System.out.println("Integer2 is greater than integer1 ");
        }
        else{
            System.out.println("Integer1 is greater than integer2 ");
        }
    }
    void addition(){
        int add = integer1 + integer2;
        System.out.println("Addition of int1 and int2 is : " + add);
    }
}
class anodemoinheritance {
    public static void main(String args[]){
        another o=new another();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter int1: ");
        int int1=sc.nextInt();
        System.out.println("Enter int2: ");
        int int2=sc.nextInt();
        o.get_integer1(int1);
        o.square();
        o.cube();
        o.get_integer2(int2);
        o.maximum();
        o.addition();
    }
}
