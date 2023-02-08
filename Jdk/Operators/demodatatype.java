class demodatatype 
{
    public static void main(String args[])
    {
       int a;
       a=12345;
       System.out.println("a="+a); // "a="+a  where +a is used for concatation to join the text and the output.
       float b;
       b=3456.678f;
       System.out.println("b="+b);
       byte l=127; // byte is used to print numbers upto 1 to 127.
       System.out.println("l="+l);
       boolean r=false;
       System.out.println("r="+r);
       double d=4561234.567; // double is used for bigger decimal numbers or  are stored as IEEE 64-bit (8-byte) floating-point numbers ranging in value from: -1.79769313486231E308 to -4.94065645841247E-324 for negative values
       System.out.println("d="+d);
       long e=23423; // The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1.
       System.out.println("e="+e); // long is used for bigger number
       short f=5;
       System.out.println("f="+f); //
       char g='r'; // char is used in single quotes
       System.out.println("g="+g);
    }
}