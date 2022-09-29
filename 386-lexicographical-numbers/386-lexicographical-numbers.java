class Solution {
    public static void lexSort(int curr,int n,List<Integer> l){
        if(curr>n){
            return;
        }
        else{
            l.add(curr);//Starting from 1 with least size and 
            for(int i=0;i<10;++i){
                if(10*curr+i>n)//Increaing Size
                    return;
                lexSort(10*curr+i, n,l);//Performing Recursing
            }
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<>();
        for(int i = 1;i<10;i++){//for all 1 - 9 digits
            lexSort(i,n,l);
        }
        return l;
        
        /*
        //CHEATING method
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