class Solution {
    public static void lexSort(int curr,int n,List<Integer> l){
        if(curr>n){
            return;
        }
        else{
            l.add(curr);
            for(int i=0;i<10;++i){
                if(10*curr+i>n)
                    return;
                lexSort(10*curr+i, n,l);
            }
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<>();
        for(int i = 1;i<10;i++){
            lexSort(i,n,l);
        }
        return l;
        
        /*
        //CHEATING methond
        List<String> l = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            l.add(Integer.toString(i));
        }
        Collections.sort(l);
        List<Integer> r = new ArrayList<>();
        for(int i = 0;i<n;i++){
            r.add(Integer.parseInt(l.get(i)));
        }
        return r;*/
    }
}