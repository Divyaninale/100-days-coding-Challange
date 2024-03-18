public class Stack_By_LinkedList
{
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        public static Node head=null;

        public static boolean isEmpty()
        {
            return head==null;
        }
        public static void push(int data)
        {
            Node newnode=new Node(data);
            if(isEmpty())
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int data=head.data;
            head=head.next;
            return data;
        }
        public static int peek()
        {
            return head.data;
        }


    }
    public static void main(String args[])
    {
           Stack s=new Stack();
           s.push(4);
           s.push(3);
           s.push(5);
           while(!s.isEmpty())
           {
            System.out.print(s.peek());
            s.pop();
           }
    }
}