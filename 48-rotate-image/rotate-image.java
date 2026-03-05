class Solution {

    public static void reverse(int[][] arr){
        for(int i = 0;i < arr.length;i ++){
            int left = 0, right = arr.length - 1;
            while(left < right){
            int temp = arr[i][left];
            arr[i][left] = arr[i][right];
            arr[i][right] = temp;
            left++;
            right--;
            }
        }
    }
    public void rotate(int[][] matrix) {
        for(int i = 0;i < matrix.length;i ++){
            for(int j = i + 1;j < matrix[0].length;j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        reverse(matrix);
    }
}