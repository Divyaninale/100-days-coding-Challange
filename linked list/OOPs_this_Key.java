public class OOPs_this_Key {
    public static void main(String args[]) {
        // A obj=new A();
        // System.out.println(obj);
        // obj.show();

        B obj = new B(100);
        
    }

}
// class A
// {
// void show()
// {
// System.out.println(this);
// }
// }
// local and instance variable

class B {
     //instance variable

    B() //local variable
    {    
        
            this(300);
        
    }
    B(int a)
    {
        
        System.out.println(a);
    }

    

}
