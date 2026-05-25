class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, max = 0, maxfreq = 0;
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        while(r < s.length()){
            // (window size - count of most frequent char) <= k
            freq[ch[r]-'A']++; // store freq and increase
            maxfreq = Math.max(maxfreq,freq[ch[r]-'A']); // store maxfreq

            while((r-l+1)-maxfreq > k){ // if window size - maxfreq > k
                freq[ch[l]-'A']--; //decrease freq
                l++;
            }

            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}