// In this example, we are going to copy the values of one object into another using Java constructor.
//Java program to initialize the values from one object to another object. 
public class copycontruct_bycontruct {
    int id;
    String name;
    copycontruct_bycontruct(int i,String n){
        id=i;
        name=n;
    }
    copycontruct_bycontruct(copycontruct_bycontruct s){
        id=s.id;
        name=s.name;
    }
    void show(){
        System.out.println(id + " " + name);
    }
    public static void main(String args[]){
        copycontruct_bycontruct s1=new copycontruct_bycontruct(34,"Rohit");
        copycontruct_bycontruct s2=new copycontruct_bycontruct(s1);
        s1.show();
        s2.show();
    }
}
