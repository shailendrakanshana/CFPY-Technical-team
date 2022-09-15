class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int m = low - (low-high)/2;
        while(high>=low){
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>target){
                high = m-1;
            }
            if(nums[m]<target){
                low = m+1;
            }
            m = low - (low-high)/2;
        }
        return -1;
    }
}