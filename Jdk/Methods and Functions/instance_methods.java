public class instance_methods {
    int s;
    public int add(int a, int b){
        s= a+b;
        return s;
    }
    public static void main(String args[]){
        instance_methods o=new instance_methods();
        System.out.println("The sum is : " + o.add(5,4));
    }
}
