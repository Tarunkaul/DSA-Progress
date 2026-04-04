// brute force solution:
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0, zero = 0;
        for(int i = 0; i < nums.length; i++){
            zero = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == 0) zero++;

                if(zero <= k){
                    max = Math.max(max,j-i+1);
                } else {
                    break;
                }
            }
        }
        return max;
    }
}

// optimal solution:
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0, l = 0;

        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 0) k--;

            while(k < 0){ // if k is negative
                if(nums[l] == 0)k++; // found another zero then k++
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}
 // t.c - O(n)
// s.c - O(1)
