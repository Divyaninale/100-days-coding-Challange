public class Sort_Array_By_Frequency1
{
    public static void largest(int arr[],int n)
    {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
              if(arr[i]>large)
              {
                 large=arr[i];
              }
        }

        int frequency[]=new int[large+1];
        for(int i=0;i<n;i++)
        {
            frequency[arr[i]]++;
        }

        for(int i=0;i<frequency.length;i++)
        {
            if(frequency[i]>0)
            {
                System.out.println("freaquency of"+i+":"+frequency[i]);
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,5,2,2,1,3,3,5};
        largest(arr, arr.length);
    }
}