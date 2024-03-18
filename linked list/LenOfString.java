public class LenOfString
{
    public static void main(String args[])
    {
        String str="Divyani";
        int count=0;
        for(char ch:str.toCharArray())
        {
            count++;
        }
        System.out.println("length of string is:"+count);
    }
}