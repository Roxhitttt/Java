public class rectangle{
    void area(int length){
        int ar=length*length;
        System.out.println("Area of a Square is : " + ar);
    }
    void area(int leng,int breadth){
        int are=leng*breadth;
        System.out.println("Area of a rectangle : " + are);
    }
    public static void main(String args[]){
        rectangle o=new rectangle();
        o.area(7);
        o.area(3, 5);
}
}