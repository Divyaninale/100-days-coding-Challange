import java.util.*;

public class Check_Alphabets
{
    public static boolean Alphabet(char ch)
    {
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        char ch='@';
        System.out.println(Alphabet(ch));
    }
}