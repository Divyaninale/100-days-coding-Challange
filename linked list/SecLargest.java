import java.util.*;
public class SecLargest
{
    public static int secLarge(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && arr[i]!=max)
            {
                secmax=arr[i];
            }
        }
        return secmax;
    
    }
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=secLarge(arr,arr.length);
        System.out.println("Sec large:"+result);
    }
}