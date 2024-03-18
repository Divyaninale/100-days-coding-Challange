public class Bubble_Sort
{
    public static void bubblesort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1-i;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,5,2,6,8};
        bubblesort(arr,arr.length);
    }
}