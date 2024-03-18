public class PrimeOrNot
{
    public static boolean prime(int a)
    {
        if(a>0)
        {
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
            
                
            
        }
        return true;
    }

    public static void main(String args[])
    {
        System.out.println(prime(4));
    }
}