package LeetCode.Arrays;
brute :- // apply any sorting technique and loops


optimal :-
class Solution {
    public void sortColors(int[] nums) {
        //0_____l-1 = 0
        //l_____m-1 = 1
        //h_____n-1 = 2
         int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){ // if found 0 then swap with low
                swap(nums, low, mid);
                low++; // move pointers
                mid++; // move pointers
            } else if(nums[mid] == 1){ // if found 1 then already on place
                mid++; // so move pointer
            } else { // swap with high and move pointer to h--
                swap(nums, mid, high);
                high--;
            }
        }
    }
    void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
