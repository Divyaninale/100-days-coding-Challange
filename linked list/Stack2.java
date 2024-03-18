import java.util.*;
public class Stack2
{
    int size=10;
    int arr[]=new int[size];
    int top=-1;

    void push(int data)
    {
        top++;
        arr[top]=data;
    }

    int pop()
    {
        int data=arr[top];
        top--;
        return data;

    }

    boolean isEmpty()
    {
        return top==-1;
    }

    int peek()
    {
        return arr[top];
    }
    public static void main(String args[])
    {
          Stack2 s=new Stack2();
          s.push(3);
          s.push(4);
          s.push(5);

          while(!s.isEmpty())
          {
            System.out.println(s.peek());
            s.pop();
          }
    }
}