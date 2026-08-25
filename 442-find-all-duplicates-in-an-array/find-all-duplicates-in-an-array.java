class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i ++){
            int num = nums[i];
            if(map.containsKey(num)){
                int freq = map.get(num);
                map.put(num, freq + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(Integer i: map.keySet()){
            if(map.get(i) >= 2){
                ans.add(i);
            }
        }
        return ans;
    }
}