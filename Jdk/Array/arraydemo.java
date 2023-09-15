import java.util.Scanner;
class arraydemo
{
    public static void main(String args[])
    {
        int[] a={10,20,30,40};

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


        float[] b=new float[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.println("Enter array elements");
            b[i]=sc.nextFloat();
        }

        System.out.println("Array elements are");
        for(int i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }
    }
}