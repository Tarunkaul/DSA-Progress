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
            Arrays.fill(hash, -1); // fill all index with -1
            while (r < n) {
                if (hash[s.charAt(r)] >= l) {  // if already seen then its index store so it greater than l
                    l = Math.max(hash[s.charAt(r)] + 1, l); // if already seen then slide the window
                }
                int len = r - l + 1;
                maxlen = Math.max(len, maxlen);
                hash[s.charAt(r)] = r; // assign index where it seen
                r++;
            }
            return maxlen;
    }
}

// brute force :

class Solution {
    public int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        // Iterate through all possible starting points
        for (int i = 0; i < n; i++) {
            int[] hash = new int[256]; // For extended ASCII
            Arrays.fill(hash, 0); // fill all index with 0

            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] == 1) break; // Found a repeat
                hash[s.charAt(j)] = 1;

                int len = j - i + 1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
