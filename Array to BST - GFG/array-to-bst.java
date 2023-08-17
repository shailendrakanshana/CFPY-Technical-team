//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    List<Integer> l;
    public void solve(int first,int last,int ar[]){
        if(first>last) return;
        if(first==last){
            l.add(ar[first]);
            return;
        }
        
        int mid = (first+last)/2;
        l.add(ar[mid]);
        solve(first,mid-1,ar);
        solve(mid+1,last,ar);
    }
    
    public int[] sortedArrayToBST(int[] ar)
    {
        // Code here 
        l = new ArrayList<>();
        solve(0,ar.length-1,ar);
        
        // System.out.println(l);
        
        int ans[] = new int[ar.length];
        
        for(int i = 0;i<ar.length;i++){
            ans[i] = l.get(i);
        }
        
        return ans;
    }
}