import java.util.*;
public class Toggle_char
{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("");
        String str="Divyani";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                sb.append(ch.toUpperCase()) 
            }
        }
    }
}