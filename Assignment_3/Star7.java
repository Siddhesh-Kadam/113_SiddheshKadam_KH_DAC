class Star7
{
    public static void main(String args[])
    {
        //Up
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {   
                if(j==1)
                    System.out.print("*");
                else
                    System.out.print("**");
            }
            System.out.println();
        }

        //low
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }

            for(int j=4; j>=i; j--)
            {   
                if(j==4)
                    System.out.print("*");
                else
                    System.out.print("**");
            }
            System.out.println();
        }

            
    }
}