import java.util.*;

class Q15_LCM
{
    public static void main(String args[])
    {
        Scanner objScan = new Scanner(System.in);
        int num1, num2;
        int prod1=0; int prod2=0; int lcm=0;
        int i=1; int j=1;

        System.out.print("Enter first number: ");
        num1 = objScan.nextInt();        
        System.out.print("Enter second number: ");
        num2 = objScan.nextInt();

        while(true)
        {
            prod1 = num1*i;

            while(true)
            {
                prod2 = num2*j;

                if(prod2==prod1)
                {
                    lcm = prod1;
                    break;
                }
                else if(prod2>prod1)
                {
                    break;
                }

                j++;
            }

            if(lcm!=0)
            {
                break;
            }
            
            i++;
        }
            
        System.out.println("\n**OUTPUT**\nLCM of the numbers is " + lcm);        
    }
}