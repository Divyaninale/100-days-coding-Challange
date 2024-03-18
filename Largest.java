public class Largest
{
    public static int largest(int array[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int array[]={23,34,55,12,22};
        int result=largest(array);
        System.out.println("Largest Element is:"+result);
    }
}