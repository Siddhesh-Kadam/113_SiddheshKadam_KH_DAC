import java.util.*;

class Q14
{
	public static void main(String args[])
	{
		// System.out.println("* * * * * * ===================================");
		// System.out.println(" * * * * *  ===================================");
		// System.out.println("* * * * * * ===================================");
		// System.out.println(" * * * * *  ===================================");
		// System.out.println("* * * * * * ===================================");
		// System.out.println(" * * * * *  ===================================");
		// System.out.println("* * * * * * ===================================");
		// System.out.println("===============================================");
		// System.out.println("===============================================");
		// System.out.println("===============================================");
		// System.out.println("===============================================");
		// System.out.println("===============================================");
		// System.out.println("===============================================");
		
		for(int row=1; row<16; row++)  //Rows
		{		
			for(int col=1; col<25; col++)  //Columns
			{
				if(row<=7)
				{
					if(col>0 && col<=8)  
					{
						if(row%2==0)
						{
							System.out.print(" *");
						}                            
						else
						{
							if(col==8)
							{
								System.out.print("* ");
							}
						}			
					}
					else if(col==9)
						System.out.print(" ");
					else
						System.out.print("==");
					}
				else
				{
					System.out.print("==");
				}				
			}	
			System.out.println();
		}
	}
}