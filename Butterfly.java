public class Butterfly
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=4-1;k++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=4-1;k++)
            {
                System.out.print(" ");
            }
            
            for(int v=1;v<=i;v++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}