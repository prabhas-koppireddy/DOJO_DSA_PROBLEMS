class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, zerosCnt = 0, pos = 0;
        long mul = 1;
        int[] ans = new int[n];
        for(int i = 0;i < n;i ++){
            if(nums[i] == 0){
                pos = i;
                zerosCnt++;
            }
            else{
                mul *= nums[i];
            }
        }
        // Based On Count
        if(zerosCnt == 1){
            ans[pos] = (int)mul;
            return ans;
        }
        else if(zerosCnt > 1){
            return ans;
        }
        else{
            for(int i = 0;i < n;i ++){
                ans[i] = (int)(mul/nums[i]);
            }
        }
        return ans;
    }
}