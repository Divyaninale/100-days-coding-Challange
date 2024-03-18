public class FirstOccurance
{
    public static int FO(int arr[],int key,int i)
    {
        if(i==-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return FO(arr,key,i-1);

        
    }
    public static void main(String args[])
    {
        int arr[]={1,5,3,4,1};
        int result=FO(arr,5,arr.length-1);
        System.out.println(result);
    } 
}