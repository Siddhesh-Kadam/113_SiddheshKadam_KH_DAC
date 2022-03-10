class Pyramid5
{
    public static void main(String []args)
    {    
        for(int i=9; i>=1; i--)
        {            
            for(int j=1; j<=i-1; j++)
            {
                System.out.print("  ");
            }

            for(int j=0; j<=9-i; j++)
            {
                System.out.print((i+j)+" ");
            }

            for(int j=9; j>i; j--)
            {
                System.out.print((j-1)+" ");                
            }             
            
            System.out.println();
        }


    }
}