class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n;i ++){
            int key = nums[i];
            if(map.containsKey(key)){
                int count = map.get(key);
                map.put(key, count + 1);
            }
            else{
                map.put(key, 1);
            }
        }
        for(int value: map.keySet()){
            if(map.get(value) > n/2){
                return value;
            }
        }
        return -1;
    }
}