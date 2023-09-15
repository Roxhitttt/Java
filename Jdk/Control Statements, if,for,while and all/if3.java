// Check given character is consonent or vowel.

import java.util.Scanner;
class if3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n;
        System.out.println("Enter u:");
        n=sc.next();

        if(n.equals("a")||n.equals("e")||n.equals("i")||n.equals("o")||n.equals("u"))
        {
            System.out.println("The given alphabets are vowels");
        }
        else
        {
            System.out.println("The given alphabets are Consonents");
        }
    }
}
