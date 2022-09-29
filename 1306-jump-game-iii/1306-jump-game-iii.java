class Solution {
    //boolean array approach try karna hai
    public boolean canReach(int[] arr,int start,boolean br[]){
        if(start<0 || start>=arr.length){
            return false;
        }
        if(arr[start]==0){
            return true;
        }
        if(br[start]==false){
            br[start] = true;
            int nextValue = start + arr[start];
            int prevValue = start - arr[start];
            return canReach(arr, prevValue,br) || canReach(arr,nextValue,br);
        }
        else{
            return false;
        }
        
    }
    public boolean canReach(int[] arr, int start) {
        boolean ar[] = new boolean[arr.length];
        return canReach(arr,start,ar);
    }
}