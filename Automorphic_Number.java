public class Automorphic_Number
{
    public static void main(String args[])
    {
        int n=25;
        
        int result=n*n;
        int rem=result%10;
        if(n==rem)
        {
            System.out.println(n+":is Automorphic Number");
        }
        else{
            System.out.println(n+":is NotAutomorphic Number");
        }
    }
}