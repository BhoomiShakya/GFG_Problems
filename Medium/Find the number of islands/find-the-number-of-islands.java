//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int row, int col, int[][]visi, char [][]arr){
        visi[row][col]=1;
        Queue<Pair> qq = new LinkedList<>();
        qq.add(new Pair(row,col));
        int m=arr.length;
        int n=arr[0].length;
        while(!qq.isEmpty()){
            int r=qq.peek().row;
            int c=qq.peek().col;
            qq.remove();
            for(int delrow=-1; delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow=r+delrow;
                    int ncol=c+delcol;
                    if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && arr[nrow][ncol]=='1' && visi[nrow][ncol]==0){
                        visi[nrow][ncol]=1;
                        qq.add(new Pair(nrow, ncol));
                    }
                      
                }
            }
        }
    }
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        int[][]visi= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visi[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,visi,grid);
                }
            }
        }
        return cnt;
    }
}