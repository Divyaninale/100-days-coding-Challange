public class Factorial
{
     public static void main(String args[])
     {
        int sum=1;
        int n=5;
        for(int i=n;i>0;i--)
        {
             sum=sum*i;
        }
        System.out.println("Factorial of a given Number is:"+sum);
     }
}