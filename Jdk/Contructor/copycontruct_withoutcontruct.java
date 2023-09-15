public class copycontruct_withoutcontruct{
    int id;
    String name;
    copycontruct_withoutcontruct(int i, String n){
        id=i;
        name=n;
    }
    copycontruct_withoutcontruct(){}
    void show(){
        System.out.println(id + " " + name);
    }
    public static void main(String args[]){
        copycontruct_withoutcontruct s1=new copycontruct_withoutcontruct(233,"Rohit");
        copycontruct_withoutcontruct s2=new copycontruct_withoutcontruct();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.show();
        s2.show();
    }
}