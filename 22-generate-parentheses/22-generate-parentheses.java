class Solution {
    public static void generate(int n,int open,int close,String ans,List<String> l){
        if(open ==n && close==n){//For output
            l.add(ans);
        }
        if(open<n){//for adding opening parenthesis like (( and go on till open <n
            generate(n,open+1,close,ans+"(",l);
        }
        if(open>close){//for adding closing parethesis like (() and go on
            generate(n ,open,close+1,ans+")",l);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        generate(n,0,0,"",l);
        return l;
    }
}