// import java.util.*;
public class Power
{
    public static int Pow(int n,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        int res=n*Pow(n,pow-1);
        return res;
    }
    public static void main(String args[])
    {
        int r=Pow(2,5);
        System.out.println(r);
    }
}