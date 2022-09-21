class Solution {
    public int numIdenticalPairs(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int ar[] = new int[max+1];
        for(int i = 0;i<n;i++){
            ar[nums[i]]++;
        }
        int r = 0;
        for(int i = 0;i<max+1;i++){
            r = r + ((ar[i])*(ar[i]-1))/2;
        }
        return r;
        
    }
}