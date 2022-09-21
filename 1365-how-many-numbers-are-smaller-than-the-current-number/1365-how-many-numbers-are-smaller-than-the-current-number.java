class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*int n = nums.length;
        int ar[] = new int[n];
        for(int i = 0;i<n;i++){
            int c = 0;
            for(int j = 0;j<n;j++){
                if(nums[i]>nums[j]){
                    c++;
                }
            }
            ar[i] = c;
        }
        return ar;*/
        
        int n = nums.length;
        int ar[] = new int[n];
        for(int i = 0;i<n;i++){
            ar[i] = nums[i];
        }
        Arrays.sort(ar);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.putIfAbsent(ar[i],i);
        }
        for(int i=0;i<n;i++){
            ar[i]=map.get(nums[i]);
        }
        return ar;
        
    }
}