class Pyramid4
{
    public static void main(String []args)
    {    
        for(int i=1; i<=9; i++)
        {
            int k=1; int z=9;
            
            for(int j=1; j<=9-i; j++)
            {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }

            // for(int j=9, k=1; j>10-i; j--, k++)
            // {
            //     System.out.print((i-k)+" ");
            //     // k++;
            // } 
            
            while(z>10-i)
            {
                System.out.print((i-k)+" ");
                
                z--;
                k++;
            } 
            
            System.out.println();
        }


    }
}