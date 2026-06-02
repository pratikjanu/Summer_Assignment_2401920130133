class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int bestEnding = nums[0];
        int ans = nums[0];

        for(int i=1;i<n;i++){
            bestEnding = Math.max(bestEnding+nums[i],nums[i]);
            ans = Math.max(bestEnding,ans);
        }
        return ans;
    }
}
