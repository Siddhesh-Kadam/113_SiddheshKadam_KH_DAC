class Q1_EvenOrOdd
{
	public static void main(String args[])
	{
		int num = 4;		
		int ref = num % 2;
		
		if(ref == 0)
			System.out.println("Given number " + num + " is EVEN.");
		else
			System.out.println("Given number " + num + " is ODD");
	}
}