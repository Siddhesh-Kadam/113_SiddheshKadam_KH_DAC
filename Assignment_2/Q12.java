import java.util.*;

class Q12
{
	public static void main(String args[])
	{
		float num1, num2, num3;
		float avg;
		Scanner objScanner = new Scanner(System.in);
			
		System.out.print("Enter first number : ");
		num1 = objScanner.nextFloat();
		
		System.out.print("Enter second number : ");
		num2 = objScanner.nextFloat();
		
		System.out.print("Enter third number : ");
		num3 = objScanner.nextFloat();
		
		avg = (num1+num2+num3)/3;
		System.out.println("Average = " + avg);		
	}
}