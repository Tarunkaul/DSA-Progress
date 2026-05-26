class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return sub(nums,k)-sub(nums,k-1);
    }
    public int sub(int[] arr, int k){
        int l = 0, r = 0, count = 0;

        while(r < arr.length){
            if(arr[r] % 2 != 0){
                k--;
            }
            while(k < 0){
                if(arr[l] % 2 != 0){
                    k++;
                }
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}