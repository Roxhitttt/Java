class democonstct
{
   int i;
   int j;
    democonstct()
    {
         i=10;
         j=5;

    }
    void show()
    {
        System.out.println("first "+i);
       System.out.println("second "+j);
           
    }
    public static void main(String args[])
    {
        democonstct o=new democonstct();
        o.show();

         democonstct o2=new democonstct();
        o2.show();
    }
}