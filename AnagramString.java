import java.util.*;
public class AnagramString
{
    public static boolean Anagram(String str1,String str2)
    {
         HashMap<Character,Integer>hm=new HashMap<>();
         for(int i=0;i<str1.length();i++)
         {
            char key=str1.charAt(i);
            if(hm.containsKey(key))
            {
                hm.put(key,hm.get(key)+1);
            }
            else{
                hm.put(key,1);
            }
         }
         for(int i=0;i<str2.length();i++)
         {
            char key=str2.charAt(i);
            if(hm.containsKey(key))
            {
                if(hm.get(key)>1)
                {
                    hm.put(key,hm.get(key)-1);
                }
                else{
                    hm.remove(key);
                }
            }
            else
            {
                return false;
            }
            
         }
         if(hm.isEmpty())
         {
            return true;
         }
         return false;
    }
    public static void main(String args[])
    {
        String str1="Divya";
        String str2="iDyaj";
        System.out.println(Anagram(str1,str2));
    }
}