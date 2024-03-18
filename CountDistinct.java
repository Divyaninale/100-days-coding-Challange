import java.util.*;
public class CountDistinct
{
    public static void Distinct(int arr[],int n)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            set.add(key);
        }
        
        for(int i:set)
        {
            System.out.println(i);
        }
        System.out.println("Total distict Element in the array is:"+set.size());
    }

    public static void main(String args[])
    {
        int arr[]={1,4,5,4,3,5};
        Distinct(arr,arr.length);

    }
}