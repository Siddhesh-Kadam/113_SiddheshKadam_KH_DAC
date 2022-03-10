import java.util.*;

class Q25
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        int dec;
        String octStr;

        System.out.print("Enter an octal number: ");
        octStr = objScanner.next();

        //Coverting entered octal string to decimal
        //radix 8 is used to indicate that octStr is an octal number i/p(datatype String)
        dec = Integer.parseInt(octStr, 8); 
     
        System.out.println("Decimal number is " + dec);
    }
}