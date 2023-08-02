//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int shortestDistance(int n, int m, int mat[][], int x, int y) {
        if(mat[0][0]==0) return -1;
        if(x==0 && y==0) return 0;
        // code here
        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        
        String key = 0+"-"+0;
        q.add(key);
        int dist[][] = new int[n][m];
        for(int br[]:dist){
            Arrays.fill(br,Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        
        while(!q.isEmpty()){
            String v = q.poll();
            if(visited.contains(v)) continue;
            String ar[] = v.split("-");
            int r = Integer.valueOf(ar[0]);
            int c = Integer.valueOf(ar[1]);
            
            visited.add(v);
            //UP
            if(r+1<n && mat[r+1][c]==1){
                String p = (r+1)+"-"+c;
                dist[r+1][c] = Math.min(dist[r][c]+1,dist[r+1][c]);
                if(!visited.contains(p)) q.add(p);
            }
            //DOWN
            if(r-1>=0 && mat[r-1][c]==1){
                String p = (r-1)+"-"+c;
                dist[r-1][c] = Math.min(dist[r][c]+1,dist[r-1][c]);
                if(!visited.contains(p)) q.add(p);
            }
            //Right
            if(c+1<m && mat[r][c+1]==1){
                String p = r+"-"+(c+1);
                dist[r][c+1] = Math.min(dist[r][c]+1,dist[r][c+1]);
                if(!visited.contains(p)) q.add(p);
            }
            //Left
            if(c-1>=0 && mat[r][c-1]==1){
                String p = r+"-"+(c-1);
                dist[r][c-1] = Math.min(dist[r][c]+1,dist[r][c-1]);
                if(!visited.contains(p)) q.add(p);
            }
            
        }
        
        if(dist[x][y]==Integer.MAX_VALUE) return -1;
        return dist[x][y];
        
    }
};