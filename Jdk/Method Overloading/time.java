import java.util.Scanner;
public class time {
    int hh1,mm1,ss1;
    int hh2,mm2,ss2;
    int h,m,s;
    time(int h1,int m1, int s1, int h2, int m2, int s2){
        hh1=h1;
        mm1=m1;
        ss1=s1;

        hh2=h2;
        mm2=m2;
        ss2=s2;
    }
    void show1(){
        System.out.println(hh1 + ":" + mm1 + ":" + ss1);
        System.out.println(hh2 + ":" + mm2 + ":" + ss2);

    }
    void add(){
        h = hh1 + hh2;
        m = mm1 + mm2;
        s = ss1 + ss2;
    }
    void show2(){
        System.out.println(h + ":" + m + ":" + s);
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hours of h1 : ");
        int h1=sc.nextInt();
        System.out.println("Enter Minutes of m1 : ");
        int m1=sc.nextInt();
        System.out.println("Enter Seconds of s1 : ");
        int s1=sc.nextInt();
        System.out.println("Enter Hours of h2 : ");
        int h2=sc.nextInt();
        System.out.println("Enter Minutes of m2 : ");
        int m2=sc.nextInt();
        System.out.println("Enter Seconds of s2 : ");
        int s2=sc.nextInt();
        time o=new time(h1,m1,s1,h2,m2,s2);
        o.show1();
        o.add();
        o.show2();
    }
}
