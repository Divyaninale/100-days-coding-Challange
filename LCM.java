public class LCM
{
    public static void main(String args[])
    {
        int num1=12;
        int num2=14;
        int hcf=1;

        for(int i=1;i<=num1 || i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        int lcm=(num1*num2)/hcf;
        System.out.println("LCM of given two number is:"+lcm);

        
    }
}