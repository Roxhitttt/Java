import java.util.Scanner;
public class time {
    int hh1,mm1,ss1;
    time(int h1,int m1, int s1){
        hh1=h1;
        mm1=m1;
        ss1=s1;
 }
    void show1(){
        if(ss1>59)
        {
            mm1=mm1+1;
            ss1=ss1-60;
        }
        if(mm1>59)
        {
            hh1=hh1+1;
            mm1=mm1-60;
        }
         if(hh1>11)
        {
            hh1=hh1-12;
        }

        System.out.println(hh1 + ":" + mm1 + ":" + ss1);
    }
    void add(time t){
        ss1 = ss1 + t.ss1;
        
        mm1 = mm1 + t.mm1;
        
        hh1 = hh1 + t.hh1;
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
        time o=new time(h1,m1,s1);
        time o2=new time(h2, m2, s2);
        o.show1();
        o2.show1();
        o.add(o2);
        o.show1();
    }
}
