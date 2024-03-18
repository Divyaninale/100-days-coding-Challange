import java.util.*;
public class SumOfNnatural
{
    public static void sum(int x)
    {
        int sum=0;
        for(int i=0;i<=x;i++)
        {
           sum+=i;                                 //n(n-1)/2   als0 you can use
        }
        System.out.println("The sum is:"+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sum(x);
    }
}