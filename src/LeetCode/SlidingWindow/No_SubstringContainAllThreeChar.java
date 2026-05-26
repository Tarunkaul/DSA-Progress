class Solution {
    public int numberOfSubstrings(String s) {
        char[] ch = s.toCharArray();
        return sub(ch,3)-sub(ch,2);
    }
    public int sub(char[] ch, int k){
        int r = 0, l = 0, count = 0;
        HashMap<Character,Integer> s = new HashMap<>();
        while(r < ch.length){
            if(!s.containsKey(ch[r])){
                s.put(ch[r],1);
            }else{
                s.put(ch[r],s.getOrDefault(ch[r],0)+1);
            }
            while(s.size() > k){
                s.put(ch[l],s.get(ch[l])-1);
                if(s.get(ch[l]) == 0){
                    s.remove(ch[l]);
                }
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}