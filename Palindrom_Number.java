public class Palindrom_Number
{
    public static void main(String args[])
    {
        int a=1;
        int temp=a;
        int sum=0;
        while(a>0)
        {
            int rem=a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        if(sum==temp)
        {
            System.out.println("Pallindrom");
        }
        else{
            System.out.println("Not Pallindrom");
        }
    }
}