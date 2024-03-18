public class ReverseArray2
{
    public static void reverse(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
           int  start=0;
           int end=arr.length-1;
            while(start<end)
            {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
            }

        }
    }
    public static void main(String args[])
    {
        int arr[]={1,7,3,4,6};
        reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}