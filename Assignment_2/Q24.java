import java.util.*;

class Q24
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        int dec;
        String binStr, octStr;

        System.out.print("Enter a binary number: ");
        binStr = objScanner.next();

        //Coverting entered binary string to decimal
        //radix 2 is used to indicate that binStr is a binary input
        dec = Integer.parseInt(binStr, 2); 

        //Converting dec to octal String
        octStr = Integer.toOctalString(dec);

        System.out.println("Octal number is " + octStr);
    }
}