public class Selection_Sort
{
    public static void selection(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,5,2,6,8};
        selection(arr,arr.length);
    }
}