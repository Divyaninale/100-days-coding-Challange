public class Largest
{
    public static void large(int arr[],int n)
    {
        int large=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }

        System.out.println("Largest Element In the array is:"+large);

    }
    public static void main(String args[])
    {
        int arr[]={4,5,2,6,8,2};   //array
        large(arr,arr.length); //function calling

    }
}