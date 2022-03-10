import java.util.*;

class Q20
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        int dec;
        String hex;

        System.out.print("Enter a decimal number: ");
        dec = objScanner.nextInt();

        //Converting dec number to hexadecimal String
        hex = Integer.toHexString(dec);

        System.out.println("Hexadecimal number is " + hex);
    }
}