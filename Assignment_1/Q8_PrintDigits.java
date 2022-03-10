import java.util.*;

class Q8_PrintDigits
{
	public static void main(String args[])
	{
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Enter a number (min 1, max 999): ");
		
		String n = objScanner.next();   
		
		int len = n.length();
		
		for (int i=0; i<len; i++)
		{
			System.out.println(n.charAt(i));
		}
    }
}