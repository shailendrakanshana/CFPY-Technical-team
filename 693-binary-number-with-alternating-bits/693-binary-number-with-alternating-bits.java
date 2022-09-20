class Solution {
    public boolean hasAlternatingBits(int n) {
        for(int i = 0;i<32;i++){
            if((((n>>i)&1)==1)&&(((n>>i+1)&1)==1)){//checking two adjacent bits
                return false;
            }
            if((((n>>i)&1)==0)&&(((n>>i+1)&1)==0)){//checking two adjacent bits
                return false;
            }
            if((n>>i+1)==0){
                break;
            }
        }
        return true;
    }
}