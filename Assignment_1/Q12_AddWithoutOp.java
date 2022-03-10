import java.util.Scanner;

class Q12_AddWithoutOp
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the first number: ");		
		int num1=scan.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();

		for(int i=0; i<num2; i++)
			num1++;

		System.out.print("Sum of two numbers is: "+num1);
	}
}