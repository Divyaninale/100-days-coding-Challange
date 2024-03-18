public class ADD_First
{
    public  class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public  Node head;
    public  Node tail;
     
    public  void add(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void main(String args[])
    {
        ADD_First ll=new ADD_First();

        ll.add(2);
        ll.add(3);
        ll.add(4);
    }
}