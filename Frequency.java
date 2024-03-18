import java.util.*;
public class Frequency
{
    public static void Freqcount(int arr[],int n)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            if(hm.containsKey(key))
            {
                hm.put(key,hm.get(key)+1);
            }
            else
            {
                hm.put(key,1);
            }
        }
        Set<Integer>keys=hm.keySet();
        for(int i:keys)
        {
            System.out.println("key:"+i+","+"Frequency:"+hm.get(i));
        }
    }

    public static void main(String args[])
    {
        int arr[]={1,4,5,4,3,5};
        Freqcount(arr,arr.length);

    }
}