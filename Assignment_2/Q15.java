import java.util.*;

class Q15
{
	public static void main(String args[])
	{
		Scanner objScanner = new Scanner(System.in);
		int a,b, temp;
		
		System.out.print("Enter first number(a): ");
		a = objScanner.nextInt();
		
		System.out.print("Enter second number(b): ");
		b = objScanner.nextInt();
		
		System.out.println("Before swapping; a =  " + a + "; b = " + b);
			
		temp = 	a;
		a = b;
		b = temp;
		
		System.out.println("After swapping; a =  " + a + "; b = " + b);
	}
}