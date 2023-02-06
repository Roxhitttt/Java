class unaryoperator
{
    public static void main(String args[])
    {
        int x=10;
        System.out.println(x++); //10 (11) postfix means first it will print 10 and it will increment by one but not print anything
        System.out.println(++x); //12 prefix means first it will increment and print simultaneouly 
        System.out.println(x--); //12 (11)
        System.out.println(--x); //10

        int y=20;
        int z=30;

        System.out.println(y++ + ++y); //20 + 22 = 42
        System.out.println(z++ + z++); //30 + 31 = 61

        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a); //-11 (minus of total positive value which starts from 0)
        System.out.println(~b); //9 (positive of total minus, positive starts from 0)    
        System.out.println(!c); //false (opposite of boolean value) 
        System.out.println(!d); //true  

    }
}