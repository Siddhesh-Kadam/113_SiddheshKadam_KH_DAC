class Q4_NumberSwapWithoutTemp
{
	public static void main(String args[])
	{
		int n1 = 4;		
		int n2 = 5;
		
		System.out.println("Before swapping: n1 = " + n1 + " and n2 = " + n2);
		
		n1 += n2;    
		n2 = n1 - n2;  
		n1 -= n2;  
		
		System.out.println("After swapping: n1 = " + n1 + " and n2 = " + n2);		
	}
}