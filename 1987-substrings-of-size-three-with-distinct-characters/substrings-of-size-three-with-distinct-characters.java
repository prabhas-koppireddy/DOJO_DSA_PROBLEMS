class Solution {

    public static boolean fun(String s, int n){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < n;i ++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        if(set.size() == 3){
                return true;
        }
        else{
                return false;
        }
    }
    public int countGoodSubstrings(String s) {
        int n = s.length(), ans = 0;
        for(int i = 0;i < n - 3 + 1;i ++){
            boolean temp = fun(s.substring(i, i+3), 3);
            if(temp){
                ans = ans + 1;
            }
        }
        return ans;
    }
}