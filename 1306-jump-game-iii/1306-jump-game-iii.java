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
        /*if(start<0 || start>=arr.length){
            return false;
        }
        if(arr[start]==0){
            return true;
        }
        int nextValue = start + arr[start];
        int prevValue = start - arr[start];
        return canReach(arr, prevValue) || canReach(arr,nextValue);*/
        
        
        
        /*if(prevValue>=0 && nextValue < arr.length){
            int cp = prevValue + arr[prevValue];
            int cn = nextValue - arr[nextValue];
            if(cp<arr.length && arr[cp]==arr[start] && cn>=0&& arr[cn]==arr[start]){
                return false;
            }
            else if(cp<arr.length && arr[cp]==arr[start]){
                return canReach(arr,nextValue);
            }
            else if(cn>=0 && arr[cn]==arr[start]){
                return canReach(arr, prevValue);
            }
            else{
                return canReach(arr, prevValue) || canReach(arr,nextValue);
            }
        }
        else if(prevValue >=0){
            int cp = prevValue + arr[prevValue];
            if(cp<arr.length && arr[cp]==arr[start]){
                return false;
            }
            else{
                return canReach(arr, prevValue);
            }   
        }
        else if(nextValue <arr.length){
            int cn = nextValue - arr[nextValue];
            if(cn>=0 && arr[cn]==arr[start]){
                return cnaReach(arr,nextValue+arr[nextValue]);
            }
            else{
                return canReach(arr,cn);
            }   
        }
        else{
            return false;
        }*/
        
        
        
    }
}