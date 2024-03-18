public class InsersionSort
{
    public static void Sort(int arr[],int n)
    {
        for(int i=1;i<n-1;i++)
        {
           int curr=i;
           int prev=i-1;
           while(prev>=0 && arr[prev]>arr[curr])
           {
                arr[prev+1]=arr[prev];
                prev--;
           }
           arr[prev+1]=arr[curr];
           
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