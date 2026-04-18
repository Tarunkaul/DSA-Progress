package LeetCode.Arrays;

Brute forece :-

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0 ; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length;j++){
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}

optimal :-

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // create Hashmap

        for(int i = 0; i < nums.length; i++){
            int second = target - nums[i];
            if(map.containsKey(second)){ // check second store in map
                return new int[]{map.get(second), i}; // if store then return its index
            }

            map.put(nums[i], i); // if second is not store then store with its index
        }
        return new int[]{-1,-1};
    }
}
