class Solution {
    public int singleNumber(int[] nums) {
        //32 size counting array approach (count bits on index)
        int n = nums.length;
        int r = 0;//Will store the final answer
        for(int i = 0;i<32;i++){
            int s = 0;
            for(int j = 0;j<n;j++){
                if(((nums[j]>>i)&1)==1){//if the bit is 1 at the ith position -> s++
                    s++;
                }
            }
            s = s%3;//because elements appear 3 times
            r = r|(s<<i);// will generate the final answer
            
        }
        return r;
        
        
    }
}