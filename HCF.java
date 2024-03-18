public class HCF
{
    public static void main(String args[])
    {
        int num1=36;
        int num2=60;
        int hcf=0;

        for(int i=0;i<=num1 || i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }

        
    }
}