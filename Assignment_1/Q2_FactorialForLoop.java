class Q2_FactorialForLoop
{
	public static void main(String args[])
	{
		int num = 7;
		int fact = num;
		int displaynumber = num;   //Variable declared for output purpose
		
		for(int i=num; i>1; i--){
			num -= 1;
			fact = fact * num;
		}
		
		System.out.println("Factorial of " + displaynumber + " is " + fact);
	}
}