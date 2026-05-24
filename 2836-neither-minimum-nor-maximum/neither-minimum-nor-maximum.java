class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n <= 2){
            return -1;
        }
        return nums[1];
    }
}