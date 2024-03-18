public class Stack_By_Aarry
{
   
    public static void main(String args[])
    {
            Stack s=new Stack();
            s.push(6);
            s.push(5);
            s.push(20);

            System.out.println("Deleted element is:"+s.pop());
            System.out.println("Top element is:"+s.top());
            System.out.println("size is:"+s.size());

    }
}
class Stack
    {
          int size=10;
          int arr[]=new int[size];
          int top=-1;
          void push(int x)
          {
            top++;
            arr[top]=x;
          }

          int  pop()
          {
            int x=top;
            top--;
            return arr[x];
          }

          int top()
          {
            return arr[top];
          }

          int size()
          {
            return top+1;
          }
    }