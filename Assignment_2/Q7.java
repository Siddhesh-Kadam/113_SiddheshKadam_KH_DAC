import java.util.*;

class Q7
{
	public static void main(String args[])
	{
		int num;
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		num = objScanner.nextInt();		
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num + " x " + i + " = " + (num*i));
		}		
	}
}