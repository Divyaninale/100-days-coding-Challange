public class ASDS
{
    public static void asdc(int arr[],int n)
    { 
        int temp;
        for(int i=0;i<n-1;i++)
        {
              for(int j=0;j<n/2;j++)
              {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
              }
              for(int k=n/2;k<n-1;k++)
              {
                if(arr[k]<arr[k+1])
                {
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
              }
        }
    }
    public static void printt(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,3,9,3,6,9,2};
        asdc(arr,arr.length);
        printt(arr,arr.length);
    }
}