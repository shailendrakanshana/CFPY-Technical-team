//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int mod = 1000000007;
    static int nthFibonacci(int n){
        int memo[] = new int[n+2];
        memo[0] = 0;
        memo[1] = 1;
        
        for(int i = 2;i<=n;i++){
            memo[i] = ((memo[i-1] + memo[i-2])%mod)%mod;
        }
        
        return memo[n];
    }
}