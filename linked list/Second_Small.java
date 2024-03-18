public class Second_Small
{
    public static void large(int arr[],int n)
    {
        int small=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        int sec_small=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<sec_small && arr[i]>small)
            {
                sec_small=arr[i];
            }
        }

        System.out.println("Samllest Element In the array is:"+sec_small);

    }
    public static void main(String args[])
    {
        int arr[]={4,5,2,6,8,2};   //array
        large(arr,arr.length); //function calling

    }
}