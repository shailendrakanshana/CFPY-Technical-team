class Solution {
    public int minBitFlips(int start, int goal) {
        int r = start^goal;
        int c = 0;
        while(r!=0){
            c++;
            r = r&(r-1);
        }
        return c;
        
    }
}