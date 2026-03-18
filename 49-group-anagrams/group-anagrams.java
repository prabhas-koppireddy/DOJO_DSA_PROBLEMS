class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String string: strs){
            char[] temp = string.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(string);
        }
        return new ArrayList<>(map.values());
    }
}

/**
Create HashMap to store groups

Start loop for each string in array

Convert string to char array

Sort the char array

Convert sorted array to String key

Check if key exists in HashMap

If key not exists, create new ArrayList

Add current string to list of that key

Repeat for all strings

Get all values from HashMap

Convert values to List

Return the result
 */