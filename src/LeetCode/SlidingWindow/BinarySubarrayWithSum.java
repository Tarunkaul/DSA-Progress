// Brute :-

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0, count = 0;

        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == goal){
                    count++;
                }
                else if(sum > goal){
                    break;
                }
            }
        }
        return count;
    }
}

// optimal :-

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // sum <= goal - sum <= goal-1;
        return sub(nums,goal)-sub(nums,goal-1);
    }
    public int sub(int[] arr, int goal){
        if(goal < 0) return 0; // if goal is 0 then goal - 1 == -1 that not posible
        int l = 0, r = 0, count = 0, sum = 0;

        while(r < arr.length){
            sum += arr[r];
            while(sum > goal){
                sum -= arr[l];
                l++;
            }
            count = count+(r-l+1); // it calculate all subarray within length
            r++;
        }
        return count;
    }
}