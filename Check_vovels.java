import java.util.*;

public class Check_vovels
{
    public static boolean vovels(char ch)
    {
        if(ch!='a' && ch!='e' && ch!='i' &&ch!='o' && ch!='u')
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String args[])
    {
        char ch='i';
        System.out.println(vovels(ch));
    }
}