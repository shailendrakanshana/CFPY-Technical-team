class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = 0;
        int b = 0;
        while(a<s.length() && b<t.length()){
            if(t.charAt(b)==s.charAt(a)){
                a++;
            }
            b++;
        }
        if(a>=s.length()){
            return true;
        }
        return false;
    }
}