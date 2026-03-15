class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i ++){
            int key = nums[i];
            if(map.containsKey(key)){
                int count = map.get(key);
                ans += count;
                map.put(key, count + 1);
            }
            else{
                map.put(key, 1);
            }
        }
        return ans;
    }
}

// Brute - Force

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length, count = 0;
        for(int i = 0;i < n;i ++){
            for(int j = i + 1;j < n;j ++){
                if(nums[i] == nums[j] && (i < j)){
                    count++;
                }
            }
        }
        return count;
    }
}
