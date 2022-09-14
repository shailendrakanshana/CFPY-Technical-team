class Solution {
    public int numSubarrayProductLessThanK(int[] ar, int k) {
        int c = 0;
        int s = 0;
        int e = 0;
        long p = 1;
        int n = ar.length;
        while(e<n){
            //window grow
            p = p*ar[e];
            //window shrink
            while(p>=k && s<=e){
                p = p/ar[s];
                s++;
            }
            //ans cal
            c = c + (e - s) +1; //all element in range of s to e
            e++;
        }
        return c;
        
    }
}