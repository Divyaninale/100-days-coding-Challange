public class Strong_Number11
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
        int num=145;
        int temp=num;
        int rem;
        int sum=0;
          while(num>0)
          {
             rem=num%10;
             sum=sum+Factorial(rem);
             num=num/10;
          }
          if(temp==sum)
          {
            System.out.println(temp+":is a strong number");
          }
          else{
            System.out.println(temp+":is a Notstrong number");
          }
    }
}