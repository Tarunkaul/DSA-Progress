package LeetCode.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min) min = prices[i]; // check if prices is low then min change
            else  { // currrent_prices - min = profit
                max = Math.max(max,prices[i] - min);
            }
        }
        return max;
    }
}