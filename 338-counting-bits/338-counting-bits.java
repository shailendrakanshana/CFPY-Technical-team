class Solution {
    public int[] countBits(int n) {
        int ar[] = new int[n+1];
        for(int i = 0;i<=n;i++){
            int c = 0;
            int p = i;
            while(p!=0){
                c++;
                p = p&(p-1);
            }
            ar[i] = c;
        }
        return ar;
        
    }
}