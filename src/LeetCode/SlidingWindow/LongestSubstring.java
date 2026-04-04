// longest substring without repeatation
import java.util.Arrays;

//package LeetCode.SlidingWindow;

public class LongestSubstring {
    static void main(String[] args) {
        String s = "abcdebcaa";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static  int lengthOfLongestSubstring(String s) {
            int n = s.length(), maxlen = 0, l = 0, r = 0;
            int[] hash = new int[256];
            Arrays.fill(hash, -1);
            while (r < n) {
                if (hash[s.charAt(r)] >= l) {
                    l = Math.max(hash[s.charAt(r)] + 1, l);
                }
                int len = r - l + 1;
                maxlen = Math.max(len, maxlen);
                hash[s.charAt(r)] = r;
                r++;
            }
            return maxlen;
    }
}
