import java.util.ArrayList;
public class ArrayList_reverse
{
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        System.out.println(list);

        int si=0;
        int ei=list.size()-1;
        
        while(si<=ei)
        {
            int temp=list.get(si);
            list.set(si,list.get(ei));
            list.set(ei,temp);

            si++;
            ei--;
        }

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }


    }
}