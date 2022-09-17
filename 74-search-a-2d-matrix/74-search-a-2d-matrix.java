class Solution {
    //Efficient solution ever
    
    public static boolean binsearch(int ar[],int t){
        int l = 0;
        int h = ar.length-1;
        int m = l - ((l-h)/2);
        while(h>=l){
            if(ar[m]==t){
                return true;
            }
            if(ar[m]>t){
                h = m-1;
            }
            if(ar[m]<t){
                l = m+1;
            }
            m = l - ((l-h)/2);
            
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int p = -1;
        int l = 0;
        int h = n-1;
        int mid = l - ((l-h)/2);
        while(h>=l){
            if(matrix[mid][0]==target || matrix[mid][m-1]==target){
                return true;
            }
            if(matrix[mid][0]<target && matrix[mid][m-1]>target){
                p = mid;
                break;
            }
            if(matrix[mid][0]>target){
                h = mid-1;
            }
            if(matrix[mid][m-1]<target){
                l = mid+1;
            }
            mid = l - ((l-h)/2);
            
        }
        if(p==-1){
            return false;
        }
        return binsearch(matrix[p],target);
        
    }
}