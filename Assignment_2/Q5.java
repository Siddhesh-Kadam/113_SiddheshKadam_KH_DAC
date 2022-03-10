import java.util.*;

class Q5
{
	public static void main(String args[])
	{
		int n1, n2, product;
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		n1 = objScanner.nextInt();
		
		System.out.print("Input second number: ");
		n2 = objScanner.nextInt();
		
		product = n1*n2;
		
		System.out.println(n1 + " x " + n2 + " = " + product);
	}
}