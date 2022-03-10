import java.util.*;

class Q17
{
    public static void main(String args[])
    {        
        Scanner objScanner = new Scanner(System.in);
        String num1, num2, sumbin;
        int dec1, dec2, sum;

        System.out.print("Enter first binary number: ");
        num1 = objScanner.next();

        System.out.print("Enter second binary number: ");
        num2 = objScanner.next();

        //Converting binary to decimal 
        dec1 = Integer.parseInt(num1, 2);
        dec2 = Integer.parseInt(num2, 2);       

        //Sum of entered numbers in decimal form
        sum = dec1+dec2; 

        //Converting the sum to binary string. 
        //Data type of the converted element will be a String
        sumbin = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers = " + sumbin);

    }
}