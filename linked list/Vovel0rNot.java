public class Vovel0rNot
{
    public static void vovel(char ch)
    {
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U')
        {
            System.out.println("The given char s vovel");
        }
        else{
            System.out.println("The given char is NOT vovel");
        }
    }
    public static void main(String args[])
    {
        char ch='N';
        vovel(ch);
    }
}