public class Mergesort
{
    public static void divide(int low,int high,int arr[])
    {
        
    }
    public static void main(String args[])
    {
        int arr[]={3,4,7,2,5,9};
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            divide(0,mid-1,arr);
            divide(mid+1,n-1,arr);
            merge();
        }
        
    }
}