import java.util.*;

public class CalcuFre {
    public static void main(String args[]) {
        String str = "aaaaabbbbbccccc";
        HashMap<Character,Integer>map = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        
        Set<Character> keys = map.keySet();
        for (char ch : keys) {
            System.out.println(ch + ": " + map.get(ch));
        }
    }
}
