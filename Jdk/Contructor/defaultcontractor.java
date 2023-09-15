class defaultcontractor
{
   int i;
   int j;
    defaultcontractor()
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
        defaultcontractor o=new defaultcontractor();
        o.show();

        defaultcontractor o2=new defaultcontractor();
        o2.show();
    }
}