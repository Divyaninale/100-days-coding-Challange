public class RemoveVovel
{

    public static void main(String args[])
    {
        String str="Divyani";
        StringBuilder sb=new StringBuilder(" ");
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U')
            {
                continue;

            }
            else{
                sb.append(ch);
            }

        }
        System.out.println(sb.toString());
    }
}