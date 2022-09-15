class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2){
            return 0;
        }
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i = 0;i<n;i++){
            ts.add(nums[i]);
        }
        ArrayList<Integer> l = new ArrayList<>(ts);
        int m = 0;
        if(l.size()<2){
            return 0;
        }
        for(int i = 1;i<l.size();i++){
            int d = l.get(i)-l.get(i-1);
            if(d>m){
                m = d;
            }
        }
        return m;
        
        
    }
}