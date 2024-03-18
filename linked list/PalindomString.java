public class PalindomString
{
    public static boolean palindrom(String str)
    {
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)!=str.charAt(len-1-i))
            {
                return false;
            }
        }
        
        return true;
    
    }
    public static void main(String args[])
    {
        String str="M";
        boolean result=palindrom(str);
        System.out.println(result);


    }
}