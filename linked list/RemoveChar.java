public class RemoveChar {
    public static void main(String args[]) {
        String str = "####ddivyan+++i";
        String sb = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                sb+=ch;

            }
        }
        System.out.print(sb);
    }
}