class Pattern13
{
    public static void main(String args[])
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i; j++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++)
            {
                switch(i)
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
                        System.out.print("E "); break;
                }                
            }

            System.out.println();
        }
    }
}