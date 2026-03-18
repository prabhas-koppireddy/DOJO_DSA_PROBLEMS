class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] arr = new int[n];
        for(int i = 0;i < words.length;i ++){
            for(char ch: words[i].toCharArray()){
                arr[i] = arr[i] | (1 << (ch - 'a'));
            }
        }
        int ans = 0;
        for(int i = 0;i < n;i ++){
            for(int j = i + 1;j < n;j ++){
                if((arr[i] & arr[j]) == 0){
                    ans = Math.max(ans, (words[i].length() * words[j].length()));
                }
            }
        }
        return ans;
    }
}

/**
Initialize Variables

Create Bitmask Array

Build Bitmask for Each Word

Initialize Maximum Product

Iterate Over All Word Pairs

Check Common Characters Using Bitmask

Compute Product of Lengths

Update Maximum Product

Return Answer
 */