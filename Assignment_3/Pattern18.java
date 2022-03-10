class Pattern18
{
    public static void main(String args[])
    {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {   
                switch(j)
                {
                    case 1:
                        System.out.print("A "); break;
                    case 2:
                        System.out.print("B "); break;
                    case 3:
                        System.out.print("C "); break;
                    case 4:
                        System.out.print("D "); break;
                    case 5:
                        System.out.print("E ");
                }
                
            }

            System.out.println();
        }
    }
}