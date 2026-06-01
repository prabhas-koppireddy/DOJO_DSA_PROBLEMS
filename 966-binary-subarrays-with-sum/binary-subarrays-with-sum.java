class Solution {
    public static int count(int[] nums, int k){
        if(k < 0) return 0;
        int n = nums.length;
        int l = 0, r = 0, sum = 0, cnt = 0;
        while(r < n){
            sum += nums[r];
            while(sum > k){
                sum = sum - nums[l];
                l = l + 1;
            }
            cnt = cnt + (r - l + 1);
            r = r + 1;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return (count(nums, goal) - count(nums, goal - 1));
    }
}