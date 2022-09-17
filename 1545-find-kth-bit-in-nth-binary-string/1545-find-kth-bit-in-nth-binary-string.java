class Solution {
    public static String ReverseInv(String a){
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                s.append('0');
            }
            else{
                s.append('1');
            }
        }
        return s.reverse().toString();
    }
    public char findKthBit(int n, int k) {
        String s = "0";
        while(n>1){
            s = s + "1"+ReverseInv(s);
            n--;
        }
        return s.charAt(k-1);
        
    }
}