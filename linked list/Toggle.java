public class Toggle
{
    public static void main(String args[])
    {
        String str="Divyani";
        StringBuilder sb=new StringBuilder(" ");
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                 sb.append(Character.toLowerCase(ch));
            }
            else{
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println("string after toggle  is:"+sb.toString());
    }
}