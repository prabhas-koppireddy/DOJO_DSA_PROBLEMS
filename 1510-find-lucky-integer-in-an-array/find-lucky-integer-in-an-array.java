class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < n;i ++){
            if(map.containsKey(arr[i])){
                int prev = map.get(arr[i]);
                map.put(arr[i], prev + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int max = -1;
        for(int key : map.keySet()){
            if(key == map.get(key)){
                max = Math.max(max, key);
            }
        }
        return max;
    }
}