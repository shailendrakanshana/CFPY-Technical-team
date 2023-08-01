//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            
            for(int i=0; i<N-1; i++)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                String S[] = read.readLine().split(" ");
                temp.add(Integer.parseInt(S[0]));
                temp.add(Integer.parseInt(S[1]));
                arr.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxBinTreeGCD(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int GCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        for(ArrayList<Integer> l:arr){
            if(map.containsKey(l.get(0))) map.get(l.get(0)).add(l.get(1));
            else {
                List<Integer> p = new ArrayList<>();
                p.add(l.get(1));
                map.put(l.get(0),p);
            }
        }
        
        // System.out.println(map);
        
        int res = 0;
        for(int key:map.keySet()){
            if(map.get(key).size()!=2) continue;
            res  =Math.max(res,GCD(map.get(key).get(0),map.get(key).get(1)));
        }
        
        return res;
    }
};