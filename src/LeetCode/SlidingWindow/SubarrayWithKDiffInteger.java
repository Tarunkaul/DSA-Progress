class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n1 = sub(nums,k);
        int n2 = sub(nums,k-1);
        if(n1 == 0){
            return 0;
        }
        return sub(nums,k)-sub(nums,k-1);
    }
    public int sub(int[] nums, int k){
        int l = 0, r = 0, max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < nums.length){
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            while(map.size() > k){
                map.put(nums[l], map.get(nums[l])-1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            max += (r-l+1);
            r++;
        }
        if(map.size() != k){
            return 0;
        }
        return max;
    }
}