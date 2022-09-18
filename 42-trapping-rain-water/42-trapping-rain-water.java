class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ar[] = new int[n];// Array to store left maximum value 
        ar[0] = height[0];
        for(int i = 1;i<n;i++){ 
            ar[i] = Math.max(ar[i-1],height[i]); //Left maximum value
        }
        int br[] = new int[n];//Array to store right maximum value
        br[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            br[i] = Math.max(br[i+1],height[i]);//right maximum value
        }
        int s = 0;
        for(int i = 0;i<n;i++){
            s = s + Math.min(ar[i],br[i]) - height[i];//Finding holes and adding them.
        }
        return s;
        
    }
}