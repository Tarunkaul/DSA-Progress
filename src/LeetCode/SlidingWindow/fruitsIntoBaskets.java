// Brute :-
class Solution {
    public int totalFruit(int[] fruits) {
        int ans= 0;
        int n = fruits.length;
        for(int i = 0; i < n; i++){
            Set<Integer> set = new HashSet<>();
            int max = 0;
            for(int j = i; j < n; j++){
                set.add(fruits[j]);
                if(set.size() > 2) break;
                max++;
                ans = Math.max(max,ans);
            }
        }
        return ans;
    }
}

// optimal :-
class Solution {
    public int totalFruit(int[] fruits) {
        int r=0,l=0,max=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(r < fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1); // add element and increase freq.
            if(map.size() > 2){
                while(map.size() > 2){
                    map.put(fruits[l],map.get(fruits[l])-1); // decrese freq until size <= 2
                    if(map.get(fruits[l]) == 0){
                        map.remove(fruits[l]); // remove if freq == 0
                    }
                    l++;
                }
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}