import java.util.*;
public class Anagram
{
    public static boolean anagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }

        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
           if(map.containsKey(ch))
           {
            map.put(ch,map.get(ch)+1);
           }
           else{
            map.put(ch,1);
           }
        }
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(map.containsKey(ch))
            {
                if(map.get(ch)>1)
                {
                    map.put(ch,map.get(ch)-1);
                }
                else{
                    map.remove(ch);
                }
            }
            else{
                return false;
            }
        }
        if(map.size()==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        String str1="Siyyyy";
        String str2="yyyySi";
        System.out.println(anagram(str1,str2));

    }
}