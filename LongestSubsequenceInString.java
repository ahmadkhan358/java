import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubsequenceInString {

    public static int calculations = 0;

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("avada kedavra") + " \n" +  calculations);
    }

//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        int ans = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                calculations++;
//                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
//            }
//        }
//        return ans;
//    }
//
//    public static boolean allUnique(String s, int start, int end) {
//        Set<Character> set = new HashSet<>();
//        for (int i = start; i < end; i++) {
//            Character ch = s.charAt(i);
//            if (set.contains(ch)) return false;
//            set.add(ch);
//        }
//        return true;
//    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            calculations++;
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
                System.out.println(i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
