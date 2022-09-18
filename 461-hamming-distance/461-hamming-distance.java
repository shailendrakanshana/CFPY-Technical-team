class Solution {
    public int hammingDistance(int x, int y) {
        int r= x^y;
        int c = 0;
        while(r!=0){
            c++;
            r = r&(r-1);
        }
        return c;
        
    }
}