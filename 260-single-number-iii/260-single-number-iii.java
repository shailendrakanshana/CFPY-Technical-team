class Solution {
    public int[] singleNumber(int[] nums) {
        //Finding the XOR of all elements
        int r = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            r = r^nums[i];
        }
        //Find the right most set bit of r
        int p = 0;
        int c = r;
        while(c!=0){
            if((c&1)==1){
                break;
            }
            p++;
            c = c>>1;
        }
        //Deviding into buckets
        int temp = r;
        for(int i = 0;i<n;i++){
            int q = 1<<p;
            if((nums[i]&q)==q){
                temp = temp^nums[i];
            }
        }
        //finding the second element
        int ar[] = new int[2];
        ar[0] = temp;
        ar[1] = r^temp;
        return ar;
    }
}