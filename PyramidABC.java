import java.util.*;

public class PyramidABC{
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        char ch='A';
        for (int i = 1; i<=5; i++) {
            
            for (int j =1 ; j <= i; j++) { 
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
        }
    }
}
