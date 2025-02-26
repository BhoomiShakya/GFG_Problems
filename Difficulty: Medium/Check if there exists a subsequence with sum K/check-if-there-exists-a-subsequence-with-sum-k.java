//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
     
      Solution obj = new Solution();
      boolean ans = obj.checkSubsequenceSum(n,a,k);
      System.out.println(ans?"Yes":"No");
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  
  public static boolean solution(int N, int i, int[] arr, int k,int sum, Boolean[][]dp){
          if(i>=N){
              return sum==k;
          }
          
          if(dp[i][sum] != null){
              return dp[i][sum];
          }
      
            boolean include= false;
            if(sum+arr[i]<=k){
                include = solution(N, i+1, arr, k, sum+arr[i], dp);
            }
            
            boolean exclude = solution(N, i+1, arr, k, sum, dp);
        
        return dp[i][sum] = include || exclude;
  }
  
  public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
    // code here
    Boolean[][] dp = new Boolean[N+1][K+1]; // Memoization table
    return solution(N,0, arr, K,0, dp);
      
  }
}
     