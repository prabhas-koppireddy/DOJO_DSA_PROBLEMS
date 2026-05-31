class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, maxLen = 0, zerosCnt = 0;
        while(r < n){
            if(nums[r] == 0){
                zerosCnt++;
            }
            while(zerosCnt > k){
                if(nums[l] == 0){
                    zerosCnt--;
                }
                l++;
            }
            if(zerosCnt <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r = r + 1;
        }
        return maxLen;
    }
}