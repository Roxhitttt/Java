import java.util.*;
public class Student {
    int id;
    String name;
    int Math, Science, Marathi, Hindi;
    Student(int i, String nan, int m,int s,int ma, int h){
        id = i;
        name = nan;
        Math = m;
        Science = s;
        Marathi = ma;
        Hindi = h;
    }
    void show(){
        System.out.println("Details of Student: ");
        System.out.println();
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Marks of Math : " + Math);
        System.out.println("Marks of Science : " + Science);
        System.out.println("Marks of Marathi : " + Marathi);
        System.out.println("Marks of Hindi : " + Hindi);

        int percentage = (Math + Science + Marathi + Hindi)* 100/400;
        System.out.println("Total percentage is : " + percentage);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int idd;
        String namofs;
        int MarkoMath;
        int MarkoSci;
        int Markomarrathi;
        int Markohindi;
        System.out.println("Enter id : ");
        idd = sc.nextInt();
        System.out.println("Enter Name : ");
        namofs = sc.next();
        System.out.println("Enter Marks of Math : ");
        MarkoMath = sc.nextInt();
        System.out.println("Enter Marks of Science : ");
        MarkoSci = sc.nextInt();
        System.out.println("Enter Marks of Marathi : ");
        Markomarrathi = sc.nextInt();
        System.out.println("Enter Marks of Hindi : ");
        Markohindi = sc.nextInt();

        Student o=new Student(idd, namofs,MarkoMath, MarkoSci, Markomarrathi, Markohindi);
        o.show();
    }
}
