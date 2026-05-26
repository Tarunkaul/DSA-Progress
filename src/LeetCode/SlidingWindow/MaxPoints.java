class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l = k-1, r = cardPoints.length-1, max =0,sum=0;

        for(int i = 0; i < k;i++){
            sum += cardPoints[i];
        }
        max = sum;
        while(l >= 0){
            sum = sum - cardPoints[l] + cardPoints[r];
            max = Math.max(sum,max);
            r--;
            l--;
        }
        return max;
    }
}