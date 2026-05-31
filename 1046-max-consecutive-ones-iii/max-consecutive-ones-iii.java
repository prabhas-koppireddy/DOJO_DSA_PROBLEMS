class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, maxLen = 0;
        for(int i = 0;i < n;i ++){
            int zerosCnt = 0;
            for(int j = i;j < n;j ++){
                if(nums[j] == 0){
                    zerosCnt++;
                }
                if(zerosCnt <= k){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
                else{
                    break;
                }
            }
        }
        return maxLen;
    }
}

// optimal
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
