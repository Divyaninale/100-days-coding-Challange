public class Smallest
{
    public static int Smallest(int array[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String args[])
    {
        int array[]={23,34,55,12,22};
        int result=Smallest(array);
        System.out.println("Smallest Element is:"+result);
    }
}