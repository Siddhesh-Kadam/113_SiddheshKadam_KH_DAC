import java.util.*;

class Q23
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        int dec;
        String binStr, hexStr;

        System.out.print("Enter a binary number: ");
        binStr = objScanner.next();

        //Coverting entered binary string to decimal
        //radix 2 is used to indicate that binStr is a binary input
        dec = Integer.parseInt(binStr, 2); 

        //Converting dec to hex String
        hexStr = Integer.toHexString(dec);

        System.out.println("Hexadecimal number is " + hexStr);
    }
}