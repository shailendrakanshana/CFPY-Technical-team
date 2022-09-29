class Solution {
    public static void generate(int n,int open,int close,String ans,List<String> l){
        if(open ==n && close==n){
            l.add(ans);
        }
        if(open<n){
            generate(n,open+1,close,ans+"(",l);
        }
        if(open>close){
            generate(n ,open,close+1,ans+")",l);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        generate(n,0,0,"",l);
        return l;
    }
}