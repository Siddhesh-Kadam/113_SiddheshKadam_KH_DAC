import java.util.*;

class Q14_GCD
{
    public static void main(String args[])
    {
        Scanner objScan = new Scanner(System.in);
        int num1, num2;
        int div1=0; int div2=0; int gcd=0;

        System.out.print("Enter first number: ");
        num1 = objScan.nextInt();        
        System.out.print("Enter second number: ");
        num2 = objScan.nextInt();

        if(num1>num2)
        {
            for(int i=1; i<=num2; i++)
            {
                if(num1%i==0)
                {
                    div1 = i;
                }
                if(num2%i==0)
                {
                    div2 = i;
                }
                if(div1==div2)
                {                    
                    gcd = div1;
                }   
            }
        }
        else
        {
            for(int i=1; i<=num1; i++)
            {
                if(num1%i==0)
                {
                    div1 = i;
                }
                if(num2%i==0)
                {
                    div2 = i;
                }
                if(div1==div2)
                {
                    gcd = div1;
                }
            }
        }
            
        System.out.println("\n**OUTPUT**\nGCD of the numbers is " + gcd);        
    }
}