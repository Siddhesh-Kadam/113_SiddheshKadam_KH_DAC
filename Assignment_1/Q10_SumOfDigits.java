import java.util.*;

class Q10_SumOfDigits
{
	public static void main(String[]args)
	{
		Scanner objScanner = new Scanner(System.in);
		
		int num, len, sum = 0;
		char ch;
		String str;
		
		System.out.print("Enter a number: ");		
		
		str = objScanner.next();		
		
		len = str.length();   //Length of number
		
		for(int i=0; i<len; i++)
		{
			num = Character.getNumericValue(str.charAt(i));   //Converting char into integer data type
			sum += num;
		}
		
		System.out.println();
		System.out.print("Sum of the digits of the given number = " + sum);		
	}
}