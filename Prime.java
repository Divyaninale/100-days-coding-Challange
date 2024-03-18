public class Prime
{ 
    public static boolean prime(int N)
    {
        for(int i=2;i<N;i++)
        {
           if(N%i==0)
           {
            return false;
           }
           
        }
        return true;
    }
    public static void main(String args[])
    {
        int N=4;
        System.out.println(prime(N));

    }
}