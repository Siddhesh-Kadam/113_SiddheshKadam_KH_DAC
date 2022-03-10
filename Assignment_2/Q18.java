import java.util.*;

class Q18
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        String num1, num2, mulbin;
        int dec1, dec2, mul;

        System.out.print("Enter first binary number: ");
        num1 = objScanner.next();

        System.out.print("Enter second binary number: ");
        num2 = objScanner.next();

        //Converting binary to decimal 
        dec1 = Integer.parseInt(num1, 2);
        dec2 = Integer.parseInt(num2, 2);       

        //Sum of entered numbers in decimal form
        mul = dec1*dec2; 

        //Converting the sum to binary string. 
        //Data type of the converted element will be a String
        mulbin = Integer.toBinaryString(mul);

        System.out.println("Product of two binary numbers = " + mulbin);

    }
}