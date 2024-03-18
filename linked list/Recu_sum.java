public class Recu_sum
{
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;

        }
        int result=n+sum(n-1);
        return result;
    }
    public static void main(String args[])
    {
        int n=5;
        System.out.println(sum(n));
    }
}