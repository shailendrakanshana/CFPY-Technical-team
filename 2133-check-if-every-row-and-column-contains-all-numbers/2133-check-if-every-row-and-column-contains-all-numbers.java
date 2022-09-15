class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i =0 ;i<n;i++){
            HashSet<Integer> s = new HashSet<>();
            for(int j = 0;j<n;j++){
                s.add(matrix[i][j]);
            }
            if(s.size()!=n){
                return false;
            }
            s.clear();
            for(int j = 0;j<n;j++){
                s.add(matrix[j][i]);
            }
            if(s.size()!=n){
                return false;
            }
        }
        return true;
        
    }
}