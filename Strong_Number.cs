public class Strong_Number1
{
    public static int Factorial(int n)
    {
        int fact=1;
        for(int i=n;i>0;i--)
        {
             fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int num=143;
        int temp=num;
        int rem;
        intsum=0
          while(n>0)
          {
             rem=num%10;
             sum=sum+Factorial(rem);
             num=num/10;
          }
          if(temp==sum)
          {
            System.out.println(num+":is a strong number");
          }
    }
}