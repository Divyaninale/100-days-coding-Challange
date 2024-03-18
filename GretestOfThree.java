public class GretestOfThree
{
    public static void greatest(int a,int b,int c)
    {
        if(a>=b)
        {
            if(a>c)
            {
                System.out.println("A is greater");
            }
        }
        else if(b>=c && a<b)
        {
            
            
                System.out.println("B is greater");
            
        }
        else{
            System.out.println("c is greater");
        }
    }

    public static void main(String args[])
    {
        int a=555;
        int b=555;
        int c=3;
        greatest(a,b,c);
    }
}