import java.util.*;
public class LinkedList{
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    Scanner sc=new Scanner(System.in);

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void AddMiddle(int data)
    {
        Node newNode=new Node(data);
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element after which you want to add element:");
        int key=sc.nextInt();
        Node temp=head;

        while(temp!=null)
        {
            if(temp.data==key)
            {
                newNode.next=temp.next;
                temp.next=newNode;
                
            }
            temp=temp.next;

        }


    }
    public void removefirst()
    {
        if(head==null)
        {
            System.out.println("linkedlist is empty");
            return;
        }
        head=head.next;


    }

    public void removelast()
    {
        if(head==null)
        {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        tail=prev;
    }
    public void remove_middle()
    {
        System.out.println("Enter the element that you want delete:");
        int key=sc.nextInt();
        if(head==null)
        {
            System.out.println("list is Empty");
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                prev.next=temp.next;
                temp.next=null;
            }
            prev=temp;
            temp=temp.next;
        }

        
    }

    public void reversell()
    {
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void removeNthnode(int idx)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        int size=i;
        int Nid=size-idx;

        int j=0;
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            if(j==Nid)
            {
                prev.next=curr.next;
                curr.next=null;
            }
            prev=curr;
            curr=curr.next;
            j++;
            
        }
        
    }



    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.display(); // Display the linked list: 4 3 2

        // ll.addlast(5);
        // ll.addlast(7);
        //ll.AddMiddle(6);
        //ll.removefirst();
        //ll.removelast();
        //ll.remove_middle();
        //ll.reversell();
        ll.removeNthnode(4);
        ll.display();
        
    }
}
