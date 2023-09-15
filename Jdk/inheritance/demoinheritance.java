import java.util.Scanner;
class circle{
    int radius;
    void get_radius(int rl){
        radius=rl;
    }
    void area_circle(){
        double a=(3.14)*(radius+radius);
        System.out.println("area of a circle is : " + a);
    }
}
class cone extends circle
{
    int len;
    void get_len(int l){
        len=l;
    }
    void area_cone(){
        double a=(3.14)*(radius*len);
        System.out.println("area of cone is " + a);
    }
}
class demoinheritance{
    public static void main(String args[]){
        cone o=new cone();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius : ");
        int r=sc.nextInt();
        System.out.println("Enter length : ");
        int  l=sc.nextInt();
        o.get_radius(r);
        o.area_circle();
        o.get_len(l);
        o.area_cone();
    }
}