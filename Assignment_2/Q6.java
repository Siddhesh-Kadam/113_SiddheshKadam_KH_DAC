import java.util.*;

class Q6
{
	public static void main(String args[])
	{
		int n1, n2, sum, prod, sub, div, mod;
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		n1 = objScanner.nextInt();
		
		System.out.print("Input second number: ");
		n2 = objScanner.nextInt();
		
		sum = n1+n2;
		prod = n1*n2;
		sub = n1-n2;
		div = n1/n2;
		mod = n1%n2;
		
		System.out.println(n1 + " + " + n2 + " = " + sum);
		System.out.println(n1 + " x " + n2 + " = " + prod);
		System.out.println(n1 + " - " + n2 + " = " + sub);
		System.out.println(n1 + " / " + n2 + " = " + div);
		System.out.println(n1 + " % " + n2 + " = " + mod);
		
	}
}