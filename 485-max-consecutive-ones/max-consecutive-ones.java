class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ans = 0, count = 0;
        for(int i = 0;i < n;i ++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}