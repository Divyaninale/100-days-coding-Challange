public class Recursion1
{
    public static void Increase(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return ;
        }
        Increase(n-1);
        System.out.println(n);
        
    }
    public static void main(String args[])
    {
        int n=10;
        Increase(n);
    }
}