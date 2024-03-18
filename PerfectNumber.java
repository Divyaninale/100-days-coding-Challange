public class PerfectNumber
{
    public static void main(String args[])
    {
        int n=28;
        int temp=n;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==temp)
        {
            System.out.println(temp+":is a perfect square");
        }
        else{
            System.out.println(temp+":is a Notperfect square");
        }
    }
}