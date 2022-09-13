class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ar[] = new int[nums[n-1]+1];
        for(int i = 0;i<n;i++){
            ar[nums[i]]++;
        }
        for(int i = 0;i<nums[n-1]+1;i++){
            if(ar[i]==1){
                return i;
            }
        }
        return -1;
        
        
    }
}