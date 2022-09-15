class Solution {
    public int climbStairs(int n) {
        //Using Fabonnacci series starting from 1 and 1
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i = 1;i<n;i++){
            c = a + b;
            a = b;
            b = c;
            
        }
        return c;
        
    }
}