public class SecSmallest
{
    public static int smallest(int array[])
    {
        int min=Integer.MAX_VALUE;
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<sec_min && array[i]>min)
            {
                sec_min=array[i];
            }
        }
        return sec_min;
    }
    public static void main(String args[])
    {
        int array[]={23,34,55,12,22};
        int result=smallest(array);
        System.out.println("Second Smallest Element is:"+result);
    }
}