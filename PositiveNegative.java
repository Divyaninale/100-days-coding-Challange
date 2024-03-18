public class PositiveNegative
{
    public static void Posneg(int a)
    {
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if( a<0)
        {
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal");
        }
    }

    public static void maun(String args[])
    {
        Posneg(4);
    }
}