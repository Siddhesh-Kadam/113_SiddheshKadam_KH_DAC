import java.util.*;

class Q9_Factors
{
	public static void main(String[]args)
	{
		Scanner objScanner = new Scanner(System.in);
		int mod;
		
		System.out.print("Enter a number to find it's factors: ");
		
		int num = objScanner.nextInt();
		
		System.out.println();
		System.out.println("Factors of the given number are:");
		
		for(int i=1; i<=num; i++)
		{
			mod = num % i;
			
			if(mod==0)
				System.out.println(i);
		}
	}
}