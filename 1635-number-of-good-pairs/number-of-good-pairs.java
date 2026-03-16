class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < n;i ++) {
			int key = nums[i];
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		int ans = 0;
		for(int val: map.keySet()) {
			int count = map.get(val);
            ans += (count * (count - 1))/2;
		}
        return ans;
    }
}