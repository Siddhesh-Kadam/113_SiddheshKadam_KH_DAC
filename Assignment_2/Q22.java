import java.util.*;

class Q22
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        int dec;
        String binStr;

        System.out.print("Enter a binary number: ");
        binStr = objScanner.next();

        //Coverting entered binary string to decimal
        //radix 2 is used to indicate that binStr is a binary input
        dec = Integer.parseInt(binStr, 2); 

        System.out.println("Decimal number is " + dec);
    }
}