public class Sort_Array_By_Frequency
{
    public static void largest(int arr[],int n)
    {
        int large=arr[0];
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

        for(int i=0;i<n;i++)
        {
            System.out.println(frequency[arr[i]]);
        }
    }
    public static void main()
    {
        int arr[]={3,5,2,7,8,2,1,3,3,5};
        largest(arr, arr.length);
    }
}