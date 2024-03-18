public class Prime_In_Range1{
    public static boolean isprime(int n)
    {
        if(n<2){
            return false;
        }
        
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        
    }
    public static void main(String args[]){
          int low=1;
          int high=5;
          for(int i=low;i<=high;i++)
          {
            if(isprime(i))
            {
                System.out.println(i);
            }
          }
    }
}