class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, sum = 0;
        for(int i = 0;i < n;i ++){
            sum += (nums[i] == 0) ? -1 : 1;
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLen;
        // for(int i = 0;i < n;i ++){
        //     if(nums[i] == 0){
        //         nums[i] = -1;
        //     }
        // }
        // int length = 0;
        // for(int i = 0;i < n;i ++){
        //     int sum = 0;
        //     for(int j = i;j < n;j ++){
        //         sum += nums[j];
        //         if(sum == 0){
        //             length = Math.max(length, j - i + 1);
        //         }
        //     }
        // }
        // return length;
    }
}