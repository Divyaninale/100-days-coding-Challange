public class IsSorted
{
    public static boolean isSorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,2,4,5,6};
        boolean result=isSorted(arr,0);
        System.out.println(result);
    }
}