public class Prime_Factors
{
    public static void main(String args[])
    {
        int n=24;
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                n=n/i;
                System.out.println(i);
            }
        }
    }
}