public class FirstNaturalNumSum
{
    public static void sum(int a)
    {
        int sum=0;
        for(int i=0;i<=5;i++)
        {
              sum+=i;
        }
        System.out.println("The sum is:"+sum);
        
    }

    public static void main(String args[])
    {
        int a=5;
        sum(a);
    }
}