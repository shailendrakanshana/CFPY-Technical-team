class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c = matrix[0].length-1;
        int r = 0;
        while(c>=0&&r<matrix.length){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else if(matrix[r][c]<target){
                r++;
            }
        }
        return false;
        
    }
}