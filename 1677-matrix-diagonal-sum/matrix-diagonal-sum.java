class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primarySum = 0;
        for(int i = 0;i < n;i ++){
            primarySum = primarySum + mat[i][i];
        }
        int secondarySum = 0;
        for(int i = 0;i < n;i ++){
            secondarySum = secondarySum + mat[i][n - 1 - i];
        }
        if(n % 2 != 0){
            return primarySum + secondarySum - mat[n/2][n/2];
        }
        return primarySum + secondarySum;
    }
}