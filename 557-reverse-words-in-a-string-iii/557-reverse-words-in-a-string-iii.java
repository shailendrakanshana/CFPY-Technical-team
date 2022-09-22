class Solution {
    public static String revstring(String s){
        StringBuilder r = new StringBuilder();
        r.append(s);
        r.reverse();
        return r.toString();
    }
    public String reverseWords(String s) {
        ArrayList<String> l = new ArrayList<>();
        
        int p = 0;
        int n = s.length();
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            if(c==' '){
                l.add(s.substring(p,i));
                p = i+1;
            }
            
        }
        l.add(s.substring(p,n));
        System.out.println(l);
        for(int i = 0;i<l.size();i++){
            String temp = revstring(l.get(i));
            l.set(i,temp);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<l.size();i++){
            ans.append(l.get(i));
            ans.append(" ");
        }
        return ans.toString().trim();
        
        
    }
}