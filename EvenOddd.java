public class EvenOddd
{
    public static void evenodd(int a)
    {
        if(a%2==0)
        {
            System.out.println(a+":is Even");
        }
        else
        {
            System.out.println(a+":is odd");
        }
    }

    public static void main(String args[])
    {
        evenodd(-4);
    }
}