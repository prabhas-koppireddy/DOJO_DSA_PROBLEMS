class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0, el = 0;
        for(int i = 0;i < n;i ++){
            if(count == 0){
                el = nums[i];
                count = 1;
            }
            else if(nums[i] == el) count++;
            else count--;
        }
        int cnt = 0;
        for(int i = 0;i < n;i ++){
            if(nums[i] == el) cnt++;
            if(cnt > n/2) return el;
        }
        return -1;
    }
}