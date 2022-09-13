class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ts = n*(n+1)/2;
        int s = 0;
        for(int i = 0;i<n;i++){
            s = s + nums[i];
        }
        return ts-s;
    }
}