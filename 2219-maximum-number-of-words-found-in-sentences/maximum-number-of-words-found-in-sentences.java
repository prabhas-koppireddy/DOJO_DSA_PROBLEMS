class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int count = 0;
        for(int i = 0;i < n;i ++){
            String[] words = sentences[i].split(" ");
            count = Math.max(count, words.length);
        }
        return count;
    }
}