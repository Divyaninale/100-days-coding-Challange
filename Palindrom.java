//import java.util.*;
public class Palindrom
{
    public static boolean pali(String str)
    {
        int len=str.length();
    
        for(int i=0;i<len/2;i++)
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
        String str="noon";
        boolean result=pali(str);
        System.out.println(result);
    }
}