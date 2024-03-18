public class Count_of_digit
{
    public static void main(String args[])
    {
        int num=18877;
        int count=0;
        int rem=num%10;
        while(rem>0)
        {
            count++;
            rem=num%10;
           
        }
        System.out.println(count);
    }
} 