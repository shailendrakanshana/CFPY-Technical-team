class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> l = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            l.add(Integer.toString(i));
        }
        Collections.sort(l);
        List<Integer> r = new ArrayList<>();
        for(int i = 0;i<n;i++){
            r.add(Integer.parseInt(l.get(i)));
        }
        return r;
    }
}