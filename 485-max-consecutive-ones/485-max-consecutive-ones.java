class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int c = 0;
        int m = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                m = Math.max(c,m);
                c = 0;
            }
        }
        m = Math.max(c,m);
        return m;
        
    }
}