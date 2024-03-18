public class SelectionSort
{
    public static void Sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
           int arr[]={3,1,5,3,2,1};
           Sort(arr,arr.length);
    }
}