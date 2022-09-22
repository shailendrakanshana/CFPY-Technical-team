class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n==1){
            return n;
        }
        ArrayList<Character> l = new ArrayList<>();
        int c= 1;
        for(int i = 0;i<n-1;i++){
            if(chars[i]==chars[i+1]){
                c++;
            }
            else{
                l.add(chars[i]);
                if(c>1){
                    String r = Integer.toString(c);
                    for(int j = 0;j<r.length();j++){
                        l.add(r.charAt(j));
                    }
                }
                c = 1;
            }
        }
        l.add(chars[n-1]);
        if(c>1){
            String p = Integer.toString(c);
            for(int i = 0;i<p.length();i++){
                l.add(p.charAt(i));
            }
        }
        for(int i = 0;i<l.size();i++){
            chars[i] = l.get(i);
        }
        return l.size();
        
        
    }
}