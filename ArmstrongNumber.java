import java.util.*;
public class ArmstrongNumber
{
    public static void main(String args[])
    {
        int num=151;
        int temp=num;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=Math.pow(rem,3);
            num=num/10;


        }
        if(temp==sum)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
}