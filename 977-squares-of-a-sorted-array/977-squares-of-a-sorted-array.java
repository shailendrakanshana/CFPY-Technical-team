class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if(nums[0]>=0){
            for(int i = 0;i<n;i++){
                nums[i] = nums[i]*nums[i];
            }
            return nums;
        }
        else{
            //Finding the midPoint which devide the positive and negative side
            if(n==1){
                nums[0] = nums[0]*nums[0];
                return nums;
            }
            int midPoint  = n;
            for(int i = 0;i<n;i++){
                if(nums[i]>=0){
                    midPoint = i;
                    break;
                }
            }
            //Array to store the squares
            int ar[] = new int[n];
           // System.out.println(midPoint);
            int a = midPoint;//for positive numbers
            int b = midPoint-1;//for negative numbers
            int j = 0;//for index of ar
            while(a<n || b>=0){
                if(a>n-1){
                    ar[j] = nums[b]*nums[b];
                    //System.out.println(ar[j]+"-");
                    j++;
                    b--;
                }
                else if(b<0){
                    ar[j] = nums[a]*nums[a];
                    //System.out.println(ar[j]+"--");
                    j++;
                    a++;
                }
                else{
                    if(Math.abs(nums[a])>Math.abs(nums[b])){
                        ar[j] = nums[b]*nums[b];
                        //System.out.println(ar[j]+"---");
                        j++;
                        b--;
                    }
                    else{
                        ar[j] = nums[a]*nums[a];
                       // System.out.println(ar[j]+"----");
                        j++;
                        a++;
                    }
                }
            }
            return ar;
        }
    }
}