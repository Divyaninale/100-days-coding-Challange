public class RemoveSpaces
{
    public static void main(String args[])
    {
        String str="Di vya Na le";
        String sb="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            else{
                 sb+=ch;
            }
        
        }
        System.out.println(sb);
    }
}