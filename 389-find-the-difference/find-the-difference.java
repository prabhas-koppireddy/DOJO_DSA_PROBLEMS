class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        int m = t.length();
        int xor1 = 0, xor2 = 0;
        for(int i = 0;i < n;i ++){
            xor1 = xor1 ^ s.charAt(i);
        }
        for(int j = 0;j < m;j ++){
            xor2 = xor2 ^ t.charAt(j);
        }
        return (char)(xor1 ^ xor2);
    }
}