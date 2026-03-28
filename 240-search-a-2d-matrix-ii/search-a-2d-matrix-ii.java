class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int row = 0;row < matrix.length;row ++){
        //     for(int col = 0;col < matrix[row].length;col ++){
        //         if(matrix[row][col] == target){
        //             return true;
        //         }
        //     }
        // }
        //return false;
        int row = 0, col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}