public class Insertion_Sort
{
    public static void insertion(int arr[],int n)
    {
        for(int i=1;i<n-1;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>=curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,5,2,6,8};
        insertion(arr,arr.length);
    }
}