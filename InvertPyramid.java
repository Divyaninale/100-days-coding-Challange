import java.util.*;

public class InvertPyramid{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for (int i = 4; i>0; i--) {
            for (int j =1 ; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
