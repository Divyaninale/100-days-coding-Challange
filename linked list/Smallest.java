public class Smallest
{
    public static void small(int arr[],int n)
    {
        int small=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }

        System.out.println("Smallest Element In the array is:"+small);

    }
    public static void main(String args[])
    {
        int arr[]={4,5,2,6,8,2};   //array
        small(arr,arr.length); //function calling

    }
}