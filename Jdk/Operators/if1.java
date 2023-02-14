// Given num is even or odd  

import java.util.Scanner;
class if1
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a;
     System.out.println("Enter a:");
     a=sc.nextInt();  

     if(a%2==0)
     {
        System.out.println("Number is Even");
     }
     else
     {
        System.out.println("Number is Odd");
     }
    }
}