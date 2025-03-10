// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Search2dMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int row = matrix.length - 1;
        int col = 0;
        
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                row--;
            }
            else{
                col++;
            }
        }
        
        return false;
    }
}