import java.util.*;
public class FirstHalfAsce
{
    public static void bbsort(int arr[],int start,int end)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        bbsort(arr,0,arr.length/2);
        bbsort(arr,arr.length/2,arr.length);
        System.out.println("Sec large:"+result);
    }
}