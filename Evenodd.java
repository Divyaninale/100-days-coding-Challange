import java.util.*;
public class Evenodd
{
    public static void evenodd(int x)
    {
        if(x%2==0)
        {
            System.out.println("Even Number"+x);
        }
        else{
            System.out.println("odd Number"+x);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of integer:");
        int x=sc.nextInt();
        evenodd(x);

    }
}