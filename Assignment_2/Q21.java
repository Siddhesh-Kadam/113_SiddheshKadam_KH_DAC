import java.util.*;

class Q21
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        int dec;
        String octa;

        System.out.print("Enter a decimal number: ");
        dec = objScanner.nextInt();

        //Converting dec number to octadecimal String
        octa = Integer.toOctalString(dec);

        System.out.println("Octadecimal number is " + octa);
    }
}