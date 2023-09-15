public class demooverload{
    
    int a,b;
    
    demooverload(int l,int m){
        a=l;
        b=m;
    }
    
    void show(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    
    void add(int v1){
        a=a+v1; 
        b=b+v1;
    }
    
    void add(){
        int r=a+b;
        System.out.println("Addition of " + a + " and " + b + " is " + r);
    }
    
    void add(int l1,int l2){
        a=a+l1;
        b=b+l2;
    }
    public static void main(String args[]){
        demooverload o=new demooverload(5,5);
        o.show();
        o.add(10);
        o.show();
        o.add();
        o.show();
        o.add(5, 5);
        o.show();
    }
}