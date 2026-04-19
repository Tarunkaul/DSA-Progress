package LeetCode.Arrays;
// Brute force :-

class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            // check if element is already exist if yes then increse count
            // if not exist then increse to 1
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            // get how many times number is exist
            // if greater then length of arr / 2 then return
            if(map.get(nums[i]) > nums.length/2) return nums[i];
        }
        return -1;
    }
}


// optimal :-

class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0;
        int ans = 0;
        for(int i = 0; i < nums.length ; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }
}