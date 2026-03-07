class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int count = 0, lastSmaller = Integer.MIN_VALUE, length = 1;
        for(int i = 0;i < n;i ++){
            if(nums[i] - 1 == lastSmaller){
                count = count + 1;
                lastSmaller = nums[i];
            }
            else if(nums[i] != lastSmaller){
                count = 1;
                lastSmaller = nums[i];
            }
            length = Math.max(length, count);
        }
        return length;
    }
}