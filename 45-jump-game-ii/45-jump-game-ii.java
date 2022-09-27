class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        //GREEDY ALGO
        int Pos = 0;
        int maxPos = 0;
        int jumps = 0;
        for(int i = 0;i<n-1;i++){
            if(i+nums[i]>maxPos){
                maxPos = nums[i]+i;
            }
            if(i==Pos){
                jumps++;
                Pos = maxPos;
            }
        }
        return jumps;
    }
}