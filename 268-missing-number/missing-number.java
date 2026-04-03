class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // int sum1 = (n * (n + 1))/2;
        // int sum = 0;
        // for(int i = 0;i < n;i ++){
        //     sum += nums[i];
        // }
        // return sum1 - sum;
        int xor = 0, xor1 = 0;
        for(int i = 1;i <= n;i ++){
            xor ^= i;
        }
        for(int i = 0;i < n;i ++){
            xor1 ^= nums[i];
        }
        return xor ^ xor1;
    }
}