import java.util.Scanner;
class Company{
    int com_id;
    String com_name;
    long com_contact;
    Company(int ci,String cna,long cc){
        com_id=ci;
        com_name=cna;
        com_contact=cc;
    }
    void show1(){
        System.out.println("Id of Company is : " + com_id);
        System.out.println("Name of Company is : " + com_name);
        System.out.println("Contact of Company is : " + com_contact);
    }
}
class Employee extends Company{
    int em_id;
    String em_name;
    String em_depart;
    float em_salary;
    Employee(int ci,String cna,Long cc,int ei,String en,String ed, float es){
        super(ci,cna,cc);
        em_id=ei;
        em_name=en;
        em_depart=ed;
        em_salary=es;
    }
    void show2(){
        System.out.println("Id of Employee : " + em_id);
        System.out.println("Name of Employee : " + em_name);
        System.out.println("Department of Employee : " + em_depart);
        System.out.println("Salary of Employee : " + em_salary);
    }
}
public class inhe_contr_super_ex{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id of Company : ");
        int cid=sc.nextInt();
        System.out.println("Enter Name of Company : ");
        String cname=sc.next();
        System.out.println("Enter Contact of Company : ");
        long ccontact=sc.nextLong();

        System.out.println("Enter Id of Employee : ");
        int em_id=sc.nextInt();
        System.out.println("Enter Name of Employee : ");
        String em_name=sc.next();
        System.out.println("Enter Department of Employee : ");
        String em_depart=sc.next();
        System.out.println("Enter Salary of Employee : ");
        float em_salary=sc.nextFloat();

        Employee o=new Employee(cid,cname,ccontact,em_id,em_name,em_depart,em_salary);
        o.show1();
        o.show2();
    }
}