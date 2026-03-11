class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i ++){
            if(map.containsKey(nums[i])){
                int prev = map.get(nums[i]);
                map.put(nums[i], prev + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        int maxFreq = 0;
        for(int key: map.keySet()){
             maxFreq = Math.max(maxFreq, map.get(key));
        }
        for(int freq: map.keySet()){
            if(map.get(freq) == maxFreq){
                count += map.get(freq);
            }
        }
        return count;
    }
}