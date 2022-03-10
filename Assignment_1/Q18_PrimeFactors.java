import java.util.*;

class Q18_PrimeFactors
{
    public static void main(String args[])
    {
        Scanner objScan = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = objScan.nextInt();

        System.out.print("\n**OUTPUT**\nPrime factors: ");
        
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                if(num==i)
                    System.out.print(i);
                else
                    System.out.print(i + ", ");
            }
                
        }
    }
}