import java.util.Scanner;
class arraydemo2
{
    public static void main(String args[])
    {
        int [] b=new int[10];
        int e,f=0;
        Scanner sc=new Scanner(System.in);
   
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Array elements: ");
        b[i]=sc.nextInt();
    }
    System.out.println();
    System.out.println("Array elements are :");
    for(int i=0;i<5;i++)
    {
        System.out.println(b[i]);
    }
    System.out.println("Enter  element for search ");
    e=sc.nextInt();
    for(int i=0;i<5;i++)
    {
        if(b[i]==e)
        {
            System.out.println("Element is found");
            f=1;
        }
    }
    if(f==0)
   {
    System.out.println("Element not found in list");
   }

    }
    
}