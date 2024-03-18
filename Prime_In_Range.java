public class Prime_In_Range
{
    public static void main(String args[])
    {
        boolean isPrime=true;
        int n=5;
        for(int i=2;i<=n;i++)
        {
            if(i==2)
            {
                System.out.println(i);
                continue;
            }
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
                
            }
            if(isPrime=true)
            {
                System.out.println(i);
            }

        }
    }
}