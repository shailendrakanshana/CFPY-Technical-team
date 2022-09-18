class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> l =  new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i  = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    ArrayList<Integer> p = new ArrayList<>();
                    p.add(i);
                    p.add(j);
                    l.add(p);
                }
            }
        }
        for(int i = 0;i<l.size();i++){
            for(int j = 0;j<m;j++){
                matrix[l.get(i).get(0)][j] = 0;
            }
            for(int j = 0;j<n;j++){
                matrix[j][l.get(i).get(1)] = 0;
            }
        }
        
    }
}