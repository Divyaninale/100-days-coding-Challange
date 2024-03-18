public class Fibbonacci
{
    public static int fibbo(int n)
    {
        if(n==0 || n==1)
        {
           return n;

        }
        int fib=fibbo(n-1)+fibbo(n-2);
        return fib;
        
    }
    public static void main(String args[])
    {
        int n=6;
        System.out.println(fibbo(n));
    }
}