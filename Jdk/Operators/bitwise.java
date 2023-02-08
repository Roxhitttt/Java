class bitwise
{
    public static void main(String args[])
    {
        int a,b,c;
        a=8;
        b=9;
        c=a&b;
        System.out.println("c="+c);      //  a = 8 ---> 1 0 0 0
        c=a|b;                           //  b = 9 ---> 1 0 0 1
        System.out.println("c="+c);     //             __________
        c=a^b;                         
        System.out.println("c="+c);   //  c = a & b --> 1 0 0 0  ---> 8
        c=~a;                         //  c = a | b --> 1 0 0 1  ---> 9
        System.out.println("c="+c);
        c=a>>2;
        System.out.println("c="+c);
        c=a<<2;
        System.out.println("c="+c);
    }
}