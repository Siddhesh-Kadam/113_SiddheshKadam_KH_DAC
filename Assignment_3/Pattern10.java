class Pattern10
{
    public static void main(String[]args)
    {   
        for(int i=5; i>=1; i--)
        {
            for(int j=i-1; j>=0; j--)
            {
                System.out.print(" ");
            }

            for(int j=0; j<=5-i; j++)
            {   
                switch(i+j)
                {
                    case 5:
                        System.out.print("E "); break;
                    case 4:
                        System.out.print("D "); break;
                    case 3:
                        System.out.print("C "); break;
                    case 2:
                        System.out.print("B "); break;
                    case 1:
                        System.out.print("A "); break;                     
                }
            }

            System.out.println();
        }
    }
}