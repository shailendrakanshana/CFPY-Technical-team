class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        if(n==0){
            return false;
        }
        TreeSet<Long> ts = new TreeSet<>();
        for(int i = 0;i<n;i++){
            Long fv = ts.floor((long)nums[i]+t);//using Long instead of long because null value return
            Long cv = ts.ceiling((long)nums[i]-t);
            if((fv!=null && fv>=nums[i]) || (cv!=null && cv<=nums[i])){
                return true;
            }
            else{
                ts.add((long)nums[i]);
            }
            if(i>=k){
                ts.remove((long)nums[i-k]);
            }
        }
        return false;
        
    }
}