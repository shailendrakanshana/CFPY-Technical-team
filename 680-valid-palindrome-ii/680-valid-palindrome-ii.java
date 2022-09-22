class Solution {
    public static boolean PalCheck(ArrayList<Character> l){
        int a = 0;
        int b = l.size()-1;
        while(b>a){
            if(l.get(a)!=l.get(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        ArrayList<Character> l = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            l.add(s.charAt(i));
        }
        if(PalCheck(l)){
            return true;
        }
        ArrayList<Character> p = new ArrayList<>(l);
        int a = 0;
        int b = l.size()-1;
        while(b>a){
            if(l.get(a)!=l.get(b)){
                break;
            }
            a++;
            b--;
        }
        l.remove(a);
        p.remove(b);
        if(PalCheck(l) || PalCheck(p)){
            return true;
        }
        return false;
        
    }
}