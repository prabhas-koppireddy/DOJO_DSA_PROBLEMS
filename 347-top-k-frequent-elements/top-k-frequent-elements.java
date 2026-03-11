class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
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
        List<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){
            list.add(key);
        }
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        for(int i = 0;i < k;i ++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}