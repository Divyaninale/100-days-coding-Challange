import java.util.*;

public class SpacePyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for (int i = 0; i < x; i++) {
            for(int k=1;k<=x-i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // Change here to start from j = 0
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
