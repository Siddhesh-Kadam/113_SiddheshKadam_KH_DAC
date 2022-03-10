import java.util.*;

class Q17_Palindrome
{
    public static void main(String args[])
    {
        Scanner objScan = new Scanner(System.in);
        int numLength, num=0; int revNum=0;
        String numStr, revNumStr="";

        System.out.print("Enter a number: ");
        numStr = objScan.next();

        numLength = numStr.length(); //storing length of the entered number

        for(int i=numLength-1; i>=0; i--)
        {
            revNumStr += numStr.charAt(i);             
        }
        
        num = Integer.parseInt(numStr);
        revNum = Integer.parseInt(revNumStr);

        if(num==revNum)
            System.out.println("Entered number is a Palindrome!");        
        else
            System.out.println("Entered number is NOT a Palindrome!");
    }
}