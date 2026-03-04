class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int drop = 0;
        for(int i = 1;i < n;i ++){
            if(nums[i - 1] > nums[i]){
                drop++;
            }
        }
        if(nums[n - 1] > nums[0]){
            drop++;
        }
        return drop <= 1;
    }
}