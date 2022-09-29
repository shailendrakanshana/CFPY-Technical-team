class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l = new ArrayList<>();
        int n = arr.length;
        // if x is smaller then the smallest element 
        if(x<=arr[0]){
            for(int i = 0;i<k;i++){
                l.add(arr[i]);
            }
            return l;
        }
        // if x is greater than the largest element
        else if(x>=arr[n-1]){
            int p = n-1;
            while(k-->0){
                l.add(arr[p]);
                p--;
            }
            Collections.sort(l);
            return l;
        }
        // if x is lies between the array
        else{
            // finding the position of x
            int p = 0;
            for(int i = 0;i<n-1;i++){
                if(arr[i]<=x && arr[i+1]>=x){
                    p = i;
                    break;
                }
            }
            // Final Showdown \U0001f60e\U0001f60e\U0001f60e
            int a = p;
            int b = p+1;
            while(a>=0 || b<n){
                if(l.size()==k){
                    break;
                }
                if(a<0){
                    l.add(arr[b]);
                    b++;
                }
                else if(b>n-1){
                    l.add(arr[a]);
                    a--;
                }
                else{
                    int c = Math.abs(arr[a] -x);
                    int d = Math.abs(arr[b]-x);
                    if(c>d){
                        l.add(arr[b]);
                        b++;
                    }
                    else{
                        l.add(arr[a]);
                        a--;
                    }
                }
            }
            Collections.sort(l);
           // System.out.println("Heelo");
            return l;
        }
    }
}