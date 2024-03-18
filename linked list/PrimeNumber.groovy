public class PrimeNumber
{
    public static boolean  prime(int n)
    {
        if(n==2)
        {
            return true;
        }
        
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                     return false;
                }
                
                
            }
            
            return true;
    }
    public static void main(String args[])
    {
        for(inrt i=1;i<=100;i++)
        {
            if(prime(i))
            {
                System.out.println(i);
            }
        }

    }
}