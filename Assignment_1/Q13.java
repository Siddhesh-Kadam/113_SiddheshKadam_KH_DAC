import java.util.*;

class Q13
{
    public static void main(String args[])
    {
        Scanner objScan = new Scanner(System.in);
        int numLength, t, u;
        String num;

        System.out.print("Enter a number: ");
        num = objScan.next();

        numLength = num.length(); //storing length of the entered number

        for(int i=numLength-1; i>=0; i--)
        {
            System.out.print(num.charAt(i));
        }
    }
}