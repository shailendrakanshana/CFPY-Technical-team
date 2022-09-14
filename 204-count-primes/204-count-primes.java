class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean ar[] = new boolean[n];
        for(int i=3; i<Math.sqrt(n); i=i+2){
            if(ar[i]==false){
                for(int j=i*i; j<n; j= j +i){
                    ar[j] = true;
                }
            }
        }
        
        int c = 1;
        for(int i=3; i<n; i+=2){
            if(!ar[i]){
                c++;
            }
            
        } 
        
        return c;
    }
}