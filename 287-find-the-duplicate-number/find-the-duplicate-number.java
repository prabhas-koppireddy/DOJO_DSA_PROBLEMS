class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        // for(int i = 0;i < n - 1;i ++){
        //     if(nums[i] == nums[i + 1]){
        //         return nums[i];
        //     }
        // }
        // return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i ++){
            int key = nums[i];
            if(map.containsKey(key)){
                int prev = map.get(key);
                map.put(key, prev + 1);
            }
            else{
                map.put(key, 1);
            }
        }
        for(int k: map.keySet()){
            if(map.get(k) > 1){
                return k;
            }
        }
        return -1;
    }
}