public class Recursion
{
    public static void decrease(int n)
    {
        if(n==0)
        {
            return ;
        }
        System.out.println(n);
        decrease(n-1);
    }
    public static void main(String args[])
    {
        int n=10;
        decrease(n);
    }
}