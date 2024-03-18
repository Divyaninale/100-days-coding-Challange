public class SecLargest
{
    public static int largest(int array[])
    {
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>sec_max && array[i]<max)
            {
                sec_max=array[i];
            }
        }
        return sec_max;
    }
    public static void main(String args[])
    {
        int array[]={23,34,55,12,22};
        int result=largest(array);
        System.out.println("Second Largest Element is:"+result);
    }
}