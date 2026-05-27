class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        char[] ch = s.toCharArray();
        return sub(ch,k);
    }
    public int sub(char[] ch , int k){
        int l = 0, r = 0, max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r < ch.length){
            map.put(ch[r], map.getOrDefault(ch[r],0)+1);

            while(map.size() > k){
                map.put(ch[l], map.get(ch[l])-1);
                if(map.get(ch[l]) == 0){
                    map.remove(ch[l]);
                }
                l++;
            }
            if(map.size () == k){
                max = Math.max(max,r-l+1);
            }
            r++;
        } if(map.size() != k){
            return -1;
        }
        return max;
    }
}