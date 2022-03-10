import java.util.*;

class Q11_SmallestNumber
{
	public static void main(String[]args)
	{
		Scanner objScanner = new Scanner(System.in);
		int a, b, c, smallest=0;
				
		System.out.print("\nEnter three different numbers -\nFirst number: ");
		a = objScanner.nextInt();
		
		System.out.print("Second number: ");
		b = objScanner.nextInt();
		
		System.out.print("Third number: ");
		c = objScanner.nextInt();
		
		if(a >= b)
		{
			smallest = (b>=c)?c:b;
		}		
		else if(b >= a)
		{
			smallest = (a>=c)?c:a;
		}
		
		System.out.println("\nOUTPUT:\nThe smallest number is " + smallest);
	}
}

