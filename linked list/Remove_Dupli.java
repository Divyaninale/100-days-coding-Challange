import java.util.*;
public class Remove_Dupli
{
    public static void remove(String str,int n)
    {
        
        StringBuilder sb=new StringBuilder("");

        LinkedHashSet<Character>set=new LinkedHashSet<>();
      for(int i=0;i<n;i++)
      {
        char ch=str.charAt(i);
        set.add(ch);

      }
      for(char ch:set)
      {
        sb.append(ch);
      }
      System.out.println(sb.toString());

        
    }
    public static void main(String args[])
    {
        String str="aaaaaabbbbbbccccc";
        remove(str,str.length());
    }
}