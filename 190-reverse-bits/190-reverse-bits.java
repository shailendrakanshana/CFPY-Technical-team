public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int r = 0;
        for(int i = 0;i<32;i++){
            r = (r<<1) + ((n>>i)&1); // getting the last bit and setting it to right place
        }
        return r;
    }
}