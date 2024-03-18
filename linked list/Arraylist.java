import java.util.*;
public class Arraylist
{
    public static void reverse(ArrayList<Integer>list,int size)
    {
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);  
        list.add(2);
        list.add(3);
        System.out.print(list);
        reverse(list,list.size());
        // list.remove(1);
        // System.out.print(list);

        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i)+" ");
        // }
    }
}