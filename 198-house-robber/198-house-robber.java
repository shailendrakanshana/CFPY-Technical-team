class Solution {
    public int rob(int[] nums) {
        int n  = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int ar[] = new int[n];
        ar[0] = nums[0];
        ar[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i<n;i++){
            ar[i] = Math.max(nums[i]+ar[i-2],ar[i-1]);//will store the next sum of max loot
        }
        return ar[n-1];
        
    }
}