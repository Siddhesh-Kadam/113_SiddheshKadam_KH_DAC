import java.util.*;

class Q19
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        int dec;
        String bin;

        System.out.print("Enter a decimal number: ");
        dec = objScanner.nextInt();

        //Converting dec number to binary String
        bin = Integer.toBinaryString(dec);

        System.out.println("Binary number is " + bin);
    }
}