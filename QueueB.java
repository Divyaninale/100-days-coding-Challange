public class QueueB
{
    static class queueB
    {
        static int size;
        static int rear;
        static int arr[];

        pubic queue(int n)
        {
            size=n;
            rear=-1;
            arr[]=new int[size];
        }

        public static boolean isEmpty()
        {
            return rear==-1;
        }

        public static int add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("queue is full");
            }
        }


    }
    public static void main(String args[])
    {
       
    }
}