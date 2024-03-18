public class PositiveNegative1
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
            System.out.println("Zero");
        }
    }

    public static void main(String args[])
    {
        Posneg(-4);
    }
}