class first{
    void show(){
        System.out.println("Show");
    }
}
class second extends first{
    void show(){
        super.show();
        System.out.println("Show 1flsdj");
    }
}

public class demooverriding{
    public static void main(String args[]){
        second o=new second();
        o.show();
    }
}
