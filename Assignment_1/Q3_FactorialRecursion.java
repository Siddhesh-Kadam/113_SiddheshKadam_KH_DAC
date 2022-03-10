class Q3_FactorialRecursion
{	
	static int factorial(int number)
	{
		int ref;
		
		if(number == 0)
			ref = 1;
		else
			ref = number * factorial(number-1);
		
		return ref;
	}
	
	public static void main(String args[])
	{
		int num = 5;
		int fact;		
		// var factorialObj = new FactorialRecursion();   //Creating  instance of the class to call non-static method in static main()
		
		// fact = factorialObj.factorial(num);    //When factorial method is non-static
		fact = factorial(num);					  //When factorial method is static
				
		System.out.println("Factorial of " + num + " is " + fact);		
	}
}