public class First_Letter_Upper
{
    public static void upper(String str,int n)
    {
        StringBuilder sb=new StringBuilder(" ");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<n;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' && i<n-1)
            {
                 sb.append(ch);
                 i++;
                 sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[])
    {
        String str="divyani dipak nale";
        upper(str,str.length());

    }
}