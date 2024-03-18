import java.util.*;

public class ArmstrongInRange {
    public static int getLen(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num = num / 10;
        }
        return len;
    }

    public static int armstrong(int n, int len) {
        int res = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            res += Math.pow(rem, len);
            temp = temp / 10;
        }
        return res;
    }

    public static void main(String args[]) {
        int low = 150;
        int high = 153;

        for (int i = low; i <= high; i++) {
            int length = getLen(i);
            int result = armstrong(i, length);
            if (result == i) {
                System.out.println(i + " is Armstrong");
            }
        }
    }
}
